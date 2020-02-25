package com.leetcode.first20Page;

public class SingleRowKeyboard {

    public int calculateTime(String keyword, String word) {

        int count = 0;
        char[] letter = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            count += Math.abs(keyword.indexOf(letter[i]) - keyword.indexOf(i - 1));
        }
        return count + keyword.indexOf(letter[0]);
    }

    

}
