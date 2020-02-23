package com.leetcode.string;

public class SplitBalancedStrings {

    public int balancedSplitString(String s) {

        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                sum++;
            } else {
                sum--;
            }

            if (sum == 0) {
                cnt++;
            }
        }

        return cnt;
    }

    //"RLRRLLRLRL"
    public int balanceStrings(String s) {
        int countL = 0;
        int countR = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            System.out.println("char " + s.charAt(i));
            if (s.charAt(i) == 'R') {
                System.out.println("R " + countR++);
                if (countL == countR) {
                    System.out.println("cR" + count++);
                    countR = 0;
                    countL = 0;
                }
            } else if (s.charAt(i) == 'L') {
                System.out.println("L " + countL++);
                if (countL == countR) {
                    System.out.println("cL" + count++);
                    countL = 0;
                    countR = 0;
                }
            }
        }

        return count;
    }

}
