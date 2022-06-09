package com.alg.dog.stackqueue.leetcode496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] sorted = helper(nums2);
        int[] ans = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            map.put(nums2[i], sorted[i]);
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }

    public int[] helper(int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums2.length];
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < nums2[i])
                stack.pop();
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }
        return ans;
    }
}
