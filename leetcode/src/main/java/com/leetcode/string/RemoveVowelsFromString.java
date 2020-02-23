package com.leetcode.string;

public class RemoveVowelsFromString {

    public String removeVowels(String s){
        StringBuilder builder = new StringBuilder(s);

        for(int i =s.length()-1; i>=0;i--){
            char letter = builder.charAt(i);
             if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                 builder.deleteCharAt(i);
             }
        }
        return builder.toString();
    }
}
