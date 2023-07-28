package com.alg.leetcode.array;

public class P122 {
    class Solution {
        public int maxProfit(int[] prices) {

            int i = 0;
            int maxprofit=0;

            while (i<prices.length-1) {
                while (i<prices.length-1 && prices[i]>=prices[i+1])
                    i++;
                int bottom = prices[i];

                while (i<prices.length-1 && prices[i]<=prices[i+1])
                    i++;
                int top = prices[i];

                maxprofit +=top-bottom;
            }
            return maxprofit;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P122().new Solution();
        int maxprofit = solution.maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(maxprofit);
    }
}
