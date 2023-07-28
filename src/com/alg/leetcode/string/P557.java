package com.alg.leetcode.string;

public class P557 {
    class Solution {
        public String reverseWords(String s) {
            StringBuilder sb = new StringBuilder();
            for(String str:s.split("\\s")) {
                sb.append(new StringBuilder(str).reverse().toString());
                sb.append(" ");
            }
            String res = sb.toString();
            if(res.endsWith(" ")) res = res.substring(0,res.length()-1);
            return res;
        }
    }
}
