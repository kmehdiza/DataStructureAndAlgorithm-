package com.leetcode.array;

public class NonDecreasingArray {

    public static void main(String[] args) {
        boolean result = checkPossibility(new int[]{4, 2, 3, 1, 8, 9});
        System.out.println(result);
    }

    public static boolean checkPossibility(int[] nums) {

        int count = 0;
        int index = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                index = i;
                count++;
            }
        }
        if (count > 1) {
            return false;
        }
        if (count == 1) {
            if (index == nums.length - 1 || index == 0) {
                return true;
            }
        }

        return true;

    }


}
