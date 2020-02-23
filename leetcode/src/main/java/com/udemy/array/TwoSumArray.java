package com.udemy.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

    public int[] findSumArray(int[] arr,int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap();
        for (int i =0; i<arr.length;i++){
            if(!map.containsKey(target - arr[i])){
                map.put(arr[i],i);
            }else {
                result[1] = i;
                result[0] = map.get(target-arr[i]);
                return result;
            }
        }
        return result;
    }


}
