package com.udemy.search;

public class BubbleSort {


    public void bubbleSort(int[] arr){
        int n = arr.length;
        boolean isSwapped;
        for (int i =0; i<arr.length-1;i++){
            isSwapped = false;
            for (int j =0; j< arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped ==false){
                break;
            }
        }
    }

}
