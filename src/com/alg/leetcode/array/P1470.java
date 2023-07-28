package com.alg.leetcode.array;

public class P1470 {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] ans = new int[nums.length];
            int idx = 0;
            int i = 0;
            while (idx < 2 * n) {
                ans[idx++] = nums[i];
                ans[idx++] = nums[i + n];
                i++;
            }
            return ans;
        }
    }
}
