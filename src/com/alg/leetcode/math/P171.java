package com.alg.leetcode.math;

public class P171 {
    class Solution {
        public int titleToNumber(String s) {
            char [] chars = s.toCharArray();
            int ans = 0;
            for(char c:chars) {
                int i = c-'A'+1;
                ans = ans*26+i;
            }
            return ans;
        }
    }
}
