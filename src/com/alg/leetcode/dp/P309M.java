package com.alg.leetcode.dp;

public class P309M {
    class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int dp_i_0 = 0,dp_i_1 = Integer.MIN_VALUE;
            int [][] dp = new int[n+1][2];
            int prev=0,prev2=0;
            for(int i=1;i<=n;i++) {
                prev = dp_i_0;
                dp_i_0 = Math.max(dp_i_0,dp_i_1+prices[i-1]);
                dp_i_1 = Math.max(dp_i_1,prev2-prices[i-1]);
                prev2 = prev;
            }
            return dp_i_0;
        }
    }
}
