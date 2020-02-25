package com.leetcode.first20Page;

public class NumberOfStepsReduceToZero {

    public static void main(String[] args) {
        int result = numberOfSteps(121);
        System.out.println(result);
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1) {
                num = num - 1;
            }
            count++;
        }
        return count;
    }
}
