package com.alg.leetcode.string;

public class PM58II {
    class Solution {
        public String reverseLeftWords(String s, int n) {
            return s.substring(n,s.length())+s.substring(0,n);
        }
    }
}
