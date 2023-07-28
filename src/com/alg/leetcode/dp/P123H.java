package com.alg.leetcode.dp;

public class P123H {
    static class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int [][][] dp = new int[n+1][3][2];
            int dp_i_0=0,dp_i_1=Integer.MIN_VALUE;
            int k =2;



            for(int i=1;i<=n;i++){
                for(k=2;k>=1;k--){
                    dp[0][k][0]=0;
                    dp[0][k][1]=Integer.MIN_VALUE;

                    dp[i][k][0] = Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i-1]);
                    dp[i][k][1] = Math.max(dp[i-1][k][1],dp[i-1][k-1][0]-prices[i-1]);
                }
            }
            return dp[n][2][0];
        }
    }

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }
}
