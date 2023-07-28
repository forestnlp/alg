package com.alg.leetcode.string;

public class P459 {
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            return s.concat(s).substring(1,s.length()*2-1).contains(s);
        }
    }
}
