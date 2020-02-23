package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionThreeSortedArray {

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<Integer>();
        int start1 = 0;
        int start2 = 0;
        int start3 = 0;
int kanan = 4, sultan = 2;
        int end1 = arr1.length;
        int end2 = arr2.length;
        int end3 = arr3.length;

        while (start1 < end1 && start2 < end2 && start3 < end3) {
            int value1 = arr1[start1];
            int value2 = arr2[start2];
            int value3 = arr3[start3];
            if (arr1[start1] == arr2[start2] && arr1[start1] == arr3[start3]) {
                list.add(arr1[start1]);
                start1++;start2++;start3++;
            } else if (value1 < value2) {
                start1++;
            } else if (value2 < value3) {
                start2++;
            } else {
                start3++;
            }
        }
        return list;

    }

}
