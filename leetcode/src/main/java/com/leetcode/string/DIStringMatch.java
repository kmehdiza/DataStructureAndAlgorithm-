package com.leetcode.string;

public class DIStringMatch {

    public int[] diStringMatch(String S){
        int l = 0;
        int r = S.length();
        int[] ret = new int[r+1];
        int index = 0;

        for(char c:S.toCharArray()){
            if(c=='I'){
                //System.out.println("l++ " + l++);
                ret[index++] = l++;
            }else {
                //System.out.println("r-- " + r--);
                ret[index++] = r--;
            }
        }
        ret[index] = l++;
        return ret;
    }

}