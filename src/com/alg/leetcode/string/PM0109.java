package com.alg.leetcode.string;

public class PM0109 {
    class Solution {
        public boolean isFlipedString(String s1, String s2) {
            if(s1==null) return s2==null;
            if(s2==null) return false;
            if(s1.length()!=s2.length()) return false;
            StringBuffer sb = new StringBuffer(s2).append(s2);
            if(sb.toString().contains(s1)) return true;
            return false;
        }
    }

}
