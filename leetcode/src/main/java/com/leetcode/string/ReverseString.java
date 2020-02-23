package com.leetcode.string;

public class ReverseString {

    public static void main(String[] args) {

        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    public static void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        for (char c : s) {
            System.out.print(c);
        }
    }
}
