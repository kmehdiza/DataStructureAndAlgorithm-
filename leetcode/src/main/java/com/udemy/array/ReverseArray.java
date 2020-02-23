package com.udemy.array;

import com.sun.deploy.uitoolkit.impl.awt.AWTDragHelper;

public class ReverseArray {

    public int[] reverseArray(int[] arr, int start, int end) {
        start = 0;
        end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public int[] reverseArray2(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
