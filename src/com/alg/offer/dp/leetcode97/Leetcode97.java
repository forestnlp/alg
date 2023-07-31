package com.alg.offer.dp.leetcode97;

public class Leetcode97 {
    class Solution {
        public boolean isInterleave(String s1, String s2, String s3) {

            if (s1 == null || s2 == null || s3 == null) return false;

            int n = s1.length();
            int m = s2.length();
            int p = s3.length();

            if (m + n != p) return false;

            boolean[][] dp = new boolean[n + 1][m + 1];
            dp[0][0] = true;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    int k = i + j - 1;
                    if (i > 0) {
                        dp[i][j] = dp[i][j] || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(k));
                    }
                    if (j > 0) {
                        dp[i][j] = dp[i][j] || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(k));
                    }
                }
            }
            return dp[n][m];
        }
    }
}
