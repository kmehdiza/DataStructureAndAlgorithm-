package com.leetcode.first20Page;

import java.util.HashMap;
import java.util.Map;

public class SubstractProductAndSumDigitsInteger {

    public int substractProductAndSum(int n){

        if(n>=0 && n<10){
            return 0;
        }

        char[] charArray = Integer.toString(n).toCharArray();
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('0',0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);


        int sumNumber = 0;
        int timesNumber = 1;

        for (int i =0; i<charArray.length;i++){
            int digit = map.get(charArray[i]);
            sumNumber+= digit;
            timesNumber*=digit;
        }
        return timesNumber - sumNumber;
    }
}
