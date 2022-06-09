package com.alg.dog.stackqueue.leetcode739;

import java.util.Stack;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/9 - 06 - 09 - 16:20
 * @Description: com.alg.dog.stackqueue.leetcode739
 * @version: 1.0
 */
public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i])
                stack.pop();
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }
}
