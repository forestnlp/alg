package com.alg.dog.dp.leetcode931;

import java.util.Arrays;

public class Solution {

    int[][] memo;

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int res = Integer.MAX_VALUE;
        memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], 6666);
        }
        for (int i = 0; i < n; i++) {
            res = Math.min(res,dp(matrix,n-1,i));
        }
        return res;
    }

    int dp(int[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) {
            return 8888;
        }

        if (i == 0) {
            return matrix[0][j];
        }

        if (memo[i][j] != 6666) {
            return memo[i][j];
        }

        int dp = dp(matrix, i - 1, j - 1);
        int dp2 = dp(matrix, i - 1, j);
        int dp3 = dp(matrix, i - 1, j + 1);

        int minval = Math.min(dp, dp2);
        minval = Math.min(dp3, minval);

        memo[i][j] = matrix[i][j] + minval;
        return memo[i][j];
    }
}