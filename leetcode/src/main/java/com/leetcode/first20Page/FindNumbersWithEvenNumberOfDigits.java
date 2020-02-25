package com.leetcode.first20Page;

public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String string = Integer.toString(nums[i]);
            if (string.length() %2 == 0){
                count++;
            }
        }
        return count;
    }
}
