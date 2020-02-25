package com.leetcode.first20Page;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] result = decompressRleList(new int[]{1, 2, 3, 4});
        for (Integer integer: result){
            System.out.println(integer);
        }
    }

    public static int[] decompressRleList(int[] nums) {
        int[] newInt = new int[nums.length];
        int freq = 0;
        int value = 0;
        int index = 0;
        for (int i = 0; i < nums.length - 1; i+=2) {
            freq = nums[i];
            value = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                newInt[index++] = value;
            }
        }
        return newInt;
    }

}
