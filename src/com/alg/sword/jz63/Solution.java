package com.alg.sword.jz63;

import java.util.*;


public class Solution {
    /**
     * 
     * @param prices int整型一维数组 
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        int historical_lowest = Integer.MAX_VALUE;
        int highest_profit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            historical_lowest = Math.min(prices[i],historical_lowest);
            highest_profit = Math.max(prices[i]-historical_lowest,highest_profit);
        }
        return highest_profit;
    }
}