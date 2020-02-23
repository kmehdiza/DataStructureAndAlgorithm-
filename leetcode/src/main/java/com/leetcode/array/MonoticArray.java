package com.leetcode.array;

public class MonoticArray {

    public void isMonotonic(int[] A) {

         increaing(A);
    }

    public void increaing(int[] A) {
        int start = 0;
        int end = A.length - 1;

        while (start < end) {
            if (A[start] < A[start + 1]) {
                System.out.println("As = " + A[start]);
                System.out.println("As1 " + A[start + 1]);

            }
            start++;

        }
    }
}