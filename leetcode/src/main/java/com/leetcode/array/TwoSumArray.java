package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        //Add to HashMap
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(target - numbers[i])) {
                map.put(numbers[i],i);
            }else {
                output[1] = i;
                output[0] = map.get(target-numbers[i]);
                return output;
            }
        }


        return output;
    }

    public int[] twoSum2(int[] number, int target){
        for (int i =0; i<number.length;i++){
            int num = target - number[i];
            for (int j = i+1; j<number.length;j++){
                if (number[j] == num){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};

    }

}
