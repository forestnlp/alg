package com.alg.leetcode.math;

public class P172 {
    class Solution {
        public int trailingZeroes(int n) {
            int ans = n/5;
            int i = ans;
            while (i!=0) {
                i = i/5;
                ans+=i;
            }
            return ans;
        }
    }
}
