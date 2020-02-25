package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static void main(String[] args) {
        compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'});
    }

    public static void compress(char[] chars) {
        char[] newChar = new char[chars.length];
        int index = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], 1);
            } else {
                map.put(chars[i], map.get(chars[i])+1);
            }
        }

        for (int i =0; i<chars.length;i++){
            if (map.containsKey(chars[i])){
                int result = map.get(chars[i]);
                newChar[index++] = (char) (chars[i] + ((char) result));
            }
        }

        for (char c: newChar){
            System.out.print(c);
        }
    }

}
