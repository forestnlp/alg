package com.alg.leetcode.array;

public class PM1617 {
    class Solution {
        public int maxSubArray(int[] nums) {
            //dp
            int [] dp = new int[nums.length];
            dp[0] = nums[0];

            for(int i=1;i<nums.length;i++) {
                dp[i]= Math.max(dp[i-1]+nums[i],nums[i]);
            }

            int max = Integer.MIN_VALUE;
            for(int i=0;i<dp.length;i++) {
                max = Math.max(max,dp[i]);
            }
            return  max;
        }
    }
}
