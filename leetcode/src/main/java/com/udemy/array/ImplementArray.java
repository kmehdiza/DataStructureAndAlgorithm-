package com.udemy.array;

public class ImplementArray {

    public static void main(String[] args) {
        printArray(new int[] {3,4,5,8});
    }

    public static void printArray(int[] arr ){
        int n = arr.length;
        for(int i =0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
