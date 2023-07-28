package com.alg.leetcode.array;

public class P867 {
    class Solution {
        public int[][] transpose(int[][] A) {
            int m = A.length;
            int n = A[0].length;
            int[][] AT = new int[n][m];
            for(int i=0;i<m;i++) {
                for(int k=0;k<n;k++) {
                    AT[k][i] = A[i][k];
                }
            }
            return AT;
        }
    }
}
