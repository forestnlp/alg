package com.alg.leetcode.array;

public class P1252 {
    class Solution {
        public int oddCells(int n, int m, int[][] indices) {
            int[] row = new int[n];
            int[] col = new int[m];
            for(int i=0;i<indices.length;i++) {
                row[indices[i][0]]++;
                col[indices[i][1]]++;
            }
            int cnt=0;
            for(int i=0;i<n;i++) {
                for(int k=0;k<m;k++) {
                    int c = row[i]+col[k];
                    if(c%2!=0) cnt++;
                }
            }
            return cnt;
        }
    }
}
