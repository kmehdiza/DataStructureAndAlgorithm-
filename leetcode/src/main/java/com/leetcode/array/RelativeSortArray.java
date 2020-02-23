package com.leetcode.array;

import java.util.*;

public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        //Count the Number
        //int[] newArr = new int[100000];
        Map<Integer, Integer> countNum = new TreeMap<Integer, Integer>();
        for (int i : arr1) {
            if (!countNum.containsKey(i)) {
                Integer count = countNum.put(i, 1);
                System.out.println("count = " +count);
            } else {
                Integer count1 = countNum.put(i, countNum.get(i) + 1);
            }
        }

        //Put Back
        int index = 0;
        for(int i:arr2){
            int count = countNum.get(i);
            while (0<count){
                arr1[index++] = i;
                count--;
            }
            countNum.remove(i);
        }

        for(int i: countNum.keySet()){
            System.out.println(i);
            int count = countNum.get(i);
            while (0<count){
                arr1[index++] = i;
                count--;
            }
        }
        return arr1;
    }

    public int[] sortArray(int[] arr1, int[] arr2){
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();


        for (int i =0 ; i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
            }else {
                map.put(arr1[i],map.get(arr1[i]) + 1);
            }
        }

        int count = 0;
        int index = 0;
       for (int i =0; i<arr2.length;i++){
           if(map.containsKey(arr2[i])){
               count = map.get(arr2[i]);
               while (0<count){
                   arr1[index++] = arr2[i];
                   count--;
               }
           }
           map.remove(arr2[i]);
       }


       for (int i: map.keySet()){
           count = map.get(i);
           while (0<count){
               arr1[index++] = i;
               count--;
           }
       }
       return arr1;
    }

}
