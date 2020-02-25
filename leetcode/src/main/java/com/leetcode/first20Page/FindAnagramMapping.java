package com.leetcode.first20Page;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMapping {

    public static void main(String[] args) {
        int[] result = anagramMapping(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28});
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    public static int[] anagramMapping(int[] A, int[] B) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < B.length; i++) {
            map.put(B[i], i);
        }

        int index = 0;
        int[] newArray = new int[A.length];

        for (Integer integer : A) {
            newArray[index++] = map.get(integer);
        }
        return newArray;
    }

}
