package com.alg.leetcode.array;

public class P121 {
    class Solution {
        public int maxProfit(int[] prices) {
            int lowprice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for(int price:prices) {
                if(price<lowprice) lowprice = price;
                if(price - lowprice> maxprofit) maxprofit = price - lowprice;
            }
            return maxprofit;
        }
    }
}
