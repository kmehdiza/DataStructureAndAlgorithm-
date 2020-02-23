package com.leetcode.array;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        DegreeOfArray array = new DegreeOfArray();
        int[] result = array.findShortestSubArray(new int[]{6, 2, 3, 4});
        for (Integer integer: result){
            System.out.print(integer + " ");
        }

    }

}
