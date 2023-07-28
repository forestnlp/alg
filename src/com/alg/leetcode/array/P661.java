package com.alg.leetcode.array;

public class P661 {
    class Solution {
        public int[][] imageSmoother(int[][] M) {
            int m = M.length;
            int n = M[0].length;
            int[][] SM = new int[m][n];
            for(int i=0;i<m;i++) {
                for(int k=0;k<n;k++) {
                    int smtotal = 0;
                    int cnt=0;
                    for(int r=i-1;r<=i+1;r++) {
                        for(int c = k-1;c<=k+1;c++) {
                            if(r>=0&&r<=m-1&&c>=0&&c<=n-1){
                                cnt++;
                                smtotal+=M[r][c];
                            }
                        }
                    }
                    SM[i][k] = smtotal/cnt;
                }
            }
            return SM;
        }
    }
}
