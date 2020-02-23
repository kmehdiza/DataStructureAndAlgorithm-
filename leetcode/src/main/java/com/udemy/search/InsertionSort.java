package com.udemy.search;

public class InsertionSort {

    public void sort(int[] arr){
        int n = arr.length;

        for (int i = 1; i<n;i++){

            int temp = arr[i];
            int j = i-1; // j will track of sorted part
            while (j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];//shifting larger elements to temp by 1 positions
                j = j-1;
            }
            arr[i+1] = temp;
        }

    }

}
