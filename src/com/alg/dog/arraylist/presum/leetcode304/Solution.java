package com.alg.dog.arraylist.presum.leetcode304;

public class Solution {

    class NumMatrix {

        int[][] preSum;

        public NumMatrix(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            preSum = new int[m + 1][n + 1];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    preSum[i][j] = preSum[i][j - 1] + preSum[i - 1][j] - preSum[i - 1][j - 1] + matrix[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int i1 = preSum[row1][col1];
            int i2 = preSum[row1][col2+1];
            int i3 = preSum[row2+1][col1];
            int i4 = preSum[row2+1][col2+1];
            return i4-i3-i2+i1;
        }
    }
}