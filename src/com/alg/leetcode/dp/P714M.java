package com.alg.leetcode.dp;

public class P714M {
    static class Solution {
        public int maxProfit(int[] prices, int fee) {
            int n = prices.length;
            int [][] dp = new int[n+1][2];

            int dp_i_0 = 0,dp_i_1=Integer.MIN_VALUE;

            for(int i=1;i<=n;i++){
                int price = prices[i-1];
                dp_i_1 = Math.max(dp_i_1,dp_i_0-price);
                dp_i_0 = Math.max(dp_i_0,dp_i_1+price-fee);
            }
            return dp_i_0;
        }
    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        Solution solution = new Solution();
        int profit = solution.maxProfit(prices, fee);
        System.out.println(profit);
    }
}
