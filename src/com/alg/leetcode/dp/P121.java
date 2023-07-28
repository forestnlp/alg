package com.alg.leetcode.dp;

public class P121 {

    static class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int[][] dp = new int[n+1][2];
            dp[0][0]=0;
            dp[0][1]=Integer.MIN_VALUE;
            for(int i=1;i<=n;i++){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i-1]);
                dp[i][1]=Math.max(dp[i-1][1],-prices[i-1]);
            }
            return dp[n][0];
        }
    }


    static class Solution2 {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int dp_i_0=0,dp_1_1=Integer.MIN_VALUE;
            for(int i=1;i<=n;i++){
                dp_i_0 = Math.max(dp_i_0,dp_1_1+prices[i-1]);
                dp_1_1 = Math.max(dp_1_1,-prices[i-1]);
            }
            return dp_i_0;
        }
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(new Solution2().maxProfit(prices));
    }
}
