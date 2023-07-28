package com.alg.leetcode.dp;

public class P122 {
    static class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int[][] dp = new int[n+1][2];

            int dp_i_0=0,dp_i_1=Integer.MIN_VALUE;
            for(int i=1;i<=n;i++){
                int prev_dp_i_0 = dp_i_0;
                dp_i_0 = Math.max(dp_i_0,dp_i_1+prices[i-1]);
                dp_i_1 = Math.max(dp_i_1,prev_dp_i_0-prices[i-1]);
            }
            return dp_i_0;
        }
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new Solution().maxProfit(prices));
        prices = new int[]{1,2,3,4,5};
        System.out.println(new Solution().maxProfit(prices));
    }
}
