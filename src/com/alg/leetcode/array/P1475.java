package com.alg.leetcode.array;

import java.util.Stack;

public class P1475 {
    class Solution {
        public int[] finalPrices(int[] prices) {
            Stack<Integer> stack = new Stack<>();
            int[] ans = new int[prices.length];
            //minimal stack
            for (int i = 0; i < prices.length; i++) {
                while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                    int index = stack.pop();
                    ans[index]=prices[index]-prices[i];
                }
                stack.push(i);
            }
            while (!stack.isEmpty()){
                int index = stack.pop();
                ans[index]=prices[index];
            }
            return ans;
        }
    }
}
