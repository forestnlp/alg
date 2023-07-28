package com.alg.leetcode.string;

public class P14 {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs==null||strs.length==0) return "";
            int len = Integer.MAX_VALUE;
            for (String str : strs) len = Math.min(len, str.length());
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < len; k++) {
                boolean flag = true;
                for (int i = 1; i < strs.length; i++) {
                    if(strs[i].charAt(k)!=strs[i-1].charAt(k)) flag=false;
                }
                if(flag) {
                    sb.append(strs[0].charAt(k));
                }
                else {
                    return sb.toString();
                }
            }
            return new String(sb);
        }
    }
}
