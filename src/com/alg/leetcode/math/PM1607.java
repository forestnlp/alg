package com.alg.leetcode.math;

public class PM1607 {
    class Solution {
        public int maximum(int a, int b) {
            long c = Math.abs((long)a-b);
            long d = (c + a + b)/2;
            return (int)d;
        }
    }
}
