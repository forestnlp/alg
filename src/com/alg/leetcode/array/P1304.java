package com.alg.leetcode.array;

public class P1304 {
    class Solution {
        public int[] sumZero(int n) {
            int[] ans = new int[n];
            for (int i = 0; i < n / 2; i++) {
                ans[i] = i+1;
                ans[i + n / 2] = -i-1;
            }
            if (n % 2 != 0) ans[n - 1] = 0;
            return ans;
        }
    }
}
