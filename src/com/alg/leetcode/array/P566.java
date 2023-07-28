package com.alg.leetcode.array;

public class P566 {
    class Solution {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            int m = nums.length;
            int n = nums[0].length;
            if (m * n != r * c) return nums;

            int count = 0;
            int[][] matrix = new int[r][c];
            for (int i = 0; i < m; i++) {
                for (int k = 0; k < n; k++) {
                    matrix[count / c][count % c] = nums[i][k];
                    count++;
                }
            }
            return matrix;
        }
    }
}
