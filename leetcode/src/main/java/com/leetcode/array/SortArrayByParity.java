package com.leetcode.array;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] arr){
        int[] newArr = new int[arr.length];
        int counter = 0;

        for (int i =0; i< arr.length; i++){
            if (arr[i] %2 ==0){
                newArr[counter] = arr[i];
                counter++;
            }
        }
        for (int i = 0; i<arr.length;i++){
            if (arr[i] %2 == 1){
                newArr[counter] = arr[i];
                counter++;
            }
        }
        return newArr;
    }

    public int[] sortArrayByParity2(int[] A){
        int[] newArr = new int[A.length];

        int start = 0;
        int end = A.length-1;

        while (A[start] %2 > A[end] %2){
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
        }
        if (A[start]%2 ==0){
            newArr[start] = A[start];
            start++;
        }
        if(A[end] %2 ==1){
            newArr[end] = A[end];
            end++;
        }
        return newArr;
    }

}
