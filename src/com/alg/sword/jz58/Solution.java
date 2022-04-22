package com.alg.sword.jz58;

public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()==0) return "";
        n = n%str.length();
        StringBuilder sb = new StringBuilder(str);
        while (n-->0){
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().LeftRotateString("abcXYZdef",3));
    }
}