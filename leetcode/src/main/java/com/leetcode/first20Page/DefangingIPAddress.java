package com.leetcode.first20Page;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String result =  defangIPaddr("1.1.1.1");
        System.out.print(result);
    }

    public static String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder(address.length());
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                builder.append("[.]");
            }else {
                builder.append(address.charAt(i));
            }
        }
        return builder.toString();
    }

    public String defangIPaddress(String address){
        String s = "";
        for (int i =0; i<address.length();i++){
            if(address.charAt(i) == '.'){
                s+= "[.]";
            }else {
                s+=address.charAt(i);
            }
        }
        return s;
    }

}
