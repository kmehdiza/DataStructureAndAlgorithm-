package com.udemy.array;

public class FindValueArray {

    public int findMinValueInArray(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Ivalid input");
        }

        int min = arr[0];
        for (int i =1; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

}
