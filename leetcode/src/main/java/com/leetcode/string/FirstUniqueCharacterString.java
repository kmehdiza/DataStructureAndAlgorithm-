package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        int result = firstUniqChar("loveleetcode");
        System.out.println(result);
    }

    public static int firstUniqChar(String s) {

        int res = -1;
        for (int i =0; i<s.length()-1;){
            for (int j =1; j<s.length()-1;){
                if(s.charAt(i) != s.charAt(j)){
                    i++;
                    j++;
                }else if(s.charAt(i) == s.charAt(j)){
                    res = i;
                    break;
                }
            }
        }
        return res;
    }
    public static int firstUniqChar1(String s) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        int res = -1;

        for (int i = 0; i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i)) +1);
            }
        }

        for (int i =0; i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                res = i;
                break;
            }
        }
        return res;
    }


}
