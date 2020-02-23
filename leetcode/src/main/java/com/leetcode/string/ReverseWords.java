package com.leetcode.string;



public class ReverseWords {

    public java.lang.String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] splitedWords = s.split(" ");
        for (int i = 0; i < splitedWords.length; i++) {
            String newString = splitedWords[i];
            StringBuilder builder = new StringBuilder(newString);
            builder = builder.reverse();
            result.append(builder + " ");
        }
        return result.toString().trim();
    }


    public String reverseWords1(String s) {
        String[] words = s.split("");
        StringBuilder res = new StringBuilder();
        for(String word: words){
            res.append(new StringBuilder(word).reverse().toString()+ " ");
        }
        return res.toString().trim();
    }
}
