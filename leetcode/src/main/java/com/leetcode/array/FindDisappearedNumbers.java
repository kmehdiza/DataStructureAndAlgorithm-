package com.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        ///Add all the value to the HashMap
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], true);
        }

        //Now Check if the value from 1 to Length of Num exist in the HashMap
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < nums.length; i++) {
            if (!hashMap.containsKey(i)) {
                list.add(i);
            }
        }
        return list;
    }

}
