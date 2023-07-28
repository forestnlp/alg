package com.alg.leetcode.math;

public class P7 {
    class Solution {
        public int reverse(int x) {
            long ans = 0;

            while (x != 0) {
                ans = ans * 10 + x % 10;
                x /= 10;
            }

            return ans == (int) ans ? (int) ans : 0;
        }
    }
}
