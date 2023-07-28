package com.alg.leetcode.string;

public class P709 {
    class Solution {
        public String toLowerCase(String str) {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++) {
                char c = str.charAt(i);
                if(c>=65&&c<=90) {
                    sb.append((char)(c+32));
                }
                else {
                    sb.append(c);
                }
            }
            return new String(sb);
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<255;i++) {
            System.out.println((char)i+" "+i);
        }
    }
}
