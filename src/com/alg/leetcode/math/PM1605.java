package com.alg.leetcode.math;

public class PM1605 {
    class Solution {
        public int trailingZeroes(int n) {
            int cnt5=0;
            while (n>=5) {
                int tmp = n/5;
                n = tmp;
                cnt5+=tmp;
            }
            return cnt5;
        }
    }
}
