package com.alg.dog.stackqueue.leetcode503;

import java.util.Stack;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/9 - 06 - 09 - 16:29
 * @Description: com.alg.dog.stackqueue.leetcode503
 * @version: 1.0
 */
public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n])
                stack.pop();
            ans[i % n] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i%n]);
        }
        return ans;
    }
}