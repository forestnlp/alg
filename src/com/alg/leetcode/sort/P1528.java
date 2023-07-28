package com.alg.leetcode.sort;

public class P1528 {
    class Solution {
        public String restoreString(String s, int[] indices) {
            StringBuilder sb = new StringBuilder(s.length());
            for(int i=0;i<indices.length;i++) {
                sb.setCharAt(indices[i], s.charAt(i));
            }
            return new String(sb);
        }
    }
}
