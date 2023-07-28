package com.alg.leetcode.bit;

public class P405 {
    class Solution {
        public String toHex(int num) {
            StringBuilder sb = new StringBuilder();
            String dic = "0123456789abcdef";
            while (num!=0) {
                int i = num&15;
                sb.insert(0,dic.charAt(i));
                num>>>=4;
            }
            if(sb.length()==0) return "0";
            return sb.toString();
        }
    }
}
