package com.alg.leetcode.binarysearch;

public class P441 {
    class Solution {
        public int arrangeCoins(int n) {
            int k = (int)(Math.sqrt(2)*Math.sqrt(n+0.125)-0.5);
            return k;
        }
    }
}
