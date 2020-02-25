package com.leetcode.first20Page;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S){
        // J = "aA", S = "aAAbbbb"

        Set<Character> set = new HashSet<Character>();
        for(char j: J.toCharArray()){
            set.add(j);
        }
        int ans = 0;
        for (char s: S.toCharArray()){
            if(set.contains(s)){
                ans++;
            }
        }
        return ans;
    }

}
