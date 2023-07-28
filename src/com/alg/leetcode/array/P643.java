package com.alg.leetcode.array;

public class P643 {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int[] accnums = new int[nums.length+1];
            accnums[0] = 0;
            accnums[1] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                accnums[i+1] = nums[i] + accnums[i];
            }
            int sum = Integer.MIN_VALUE;
            for(int i=k;i<accnums.length;i++) {
                int tmp = accnums[i]-accnums[i-k];
                sum = Math.max(sum,tmp);
            }

            return (double)sum / k;
        }
    }
}
