package com.alg.leetcode.bit;

public class P693 {
    class Solution {
        public boolean hasAlternatingBits(int n) {
            int m = n^(n>>1);
            return (m&(m+1))==0;
        }
    }
}
