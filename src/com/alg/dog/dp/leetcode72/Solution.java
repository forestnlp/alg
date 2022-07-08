package com.alg.dog.dp.leetcode72;

class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i <=m; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <=n; i++) {
            dp[0][n] = i;
        }

        for (int i = 0; i <=m; i++) {
            for (int j = 0; j <=n; j++) {
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    int a = dp[i-1][j]+1;
                    int b = dp[i][j-1]+1;
                    int c = dp[i-1][j-1]+1;
                    dp[i][j] =  min(a,b,c);
                }
            }
        }
        return dp[m][n];
    }

    private int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}