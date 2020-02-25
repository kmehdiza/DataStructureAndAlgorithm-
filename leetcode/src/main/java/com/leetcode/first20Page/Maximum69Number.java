package com.leetcode.first20Page;

public class Maximum69Number {
    public static void main(String[] args) {
        int result = maximum69Number(9669);
        System.out.println(result);
    }

    public static int maximum69Number(int num) {

        String s = Integer.toString(num);
        int i = 0;
        String res = "";
        while (i < s.length()) {
            if (s.charAt(i) == '6') {
                res = s.substring(0, i) + '9' + s.substring(i + 1);
                System.out.println(res);
                break;
            }
            i++;
        }
        if (res.equals("")) {
            return num;
        }
        return Integer.parseInt(res);
    }
}
