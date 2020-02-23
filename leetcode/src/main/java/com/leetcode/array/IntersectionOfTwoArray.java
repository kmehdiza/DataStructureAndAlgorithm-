package com.leetcode.array;

import java.util.*;

public class IntersectionOfTwoArray {


    public int[] intersectionOfArray(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(Integer integer: nums1){
            set1.add(integer);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer integer: nums2){
            set2.add(integer);
        }

        set1.retainAll(set2);

        int[] result = new int[set1.size()];
        int index = 0;
        for (Integer integer: set1){
            result[index++] = integer;
        }
        return result;
    }

    public int[] insertsection(int[] nums1,int[] nums2){

        Set<Integer> set1 = new HashSet<Integer>();
        // Add the only unique values to the HashSet
        for (int i =0; i<nums1.length;i++){
            set1.add(nums1[i]);
        }

        Set<Integer> set2 = new HashSet<Integer>();
        // Add the only unique values to the HashSet
        for (int i =0; i<nums2.length;i++){
            set2.add(nums1[i]);
        }

        set1.retainAll(set2);
        int[] output = new int[set1.size()];
        int index = 0;
        for(int s: set1){
            output[index++] = s;
        }
        return output;

    }


    public int[] set_interSection(HashSet<Integer> set1,HashSet<Integer> set2){
        int[] output = new int[set1.size()];
        int idx = 0;
        for(Integer s: set1){
            if (set2.contains(s)){
                output[idx++] =s;
            }
        }
        return Arrays.copyOf(output,idx);
    }

}
