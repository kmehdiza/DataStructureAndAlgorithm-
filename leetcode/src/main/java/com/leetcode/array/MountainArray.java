package com.leetcode.array;

public class MountainArray {

    public int peakIndexInMountain(int[] A) {

        int start = 0;
        int end = A.length - 1;

        while (start < end) {
            int midPoint = start + (end - start) / 2;
            if (A[midPoint] < A[midPoint + 1]) {
                start = midPoint + 1;
            } else {
                end = midPoint;
            }
            return start;
        }


        return start;
    }


}
