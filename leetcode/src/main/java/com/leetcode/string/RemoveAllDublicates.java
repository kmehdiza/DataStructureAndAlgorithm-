package com.leetcode.string;

import java.util.Stack;

public class RemoveAllDublicates {

    public static void main(String[] args) {
        removeDublicates("abbaca");
    }

    public static void removeDublicates(String S){

        char[] letter = new char[S.length()];
        int i = 0;
        for (int j = 0; j<S.length();j++){
            char current_char = S.charAt(j);

            if(i>0 && letter[i-1] == current_char){
                i--;
            }else {
                letter[i] = current_char;
                i+=1;
            }
        }
    }

    public String removeLetterFromArray(String s){
        StringBuilder builder = new StringBuilder(s);
        Stack<Character> stack = new Stack();
        for (int i =0; i<s.length();i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        for (Character ch: stack){
            builder.append(ch);
        }
        return builder.toString();
    }
}
