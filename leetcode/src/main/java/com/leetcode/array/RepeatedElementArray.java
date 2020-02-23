package com.leetcode.array;

public class RepeatedElementArray {

    public int repeatedElementInArray(int[] A) {

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    int temp = A[i];
                    return temp;
                }
            }
        }
        throw null;
    }
}
