package com.alg.dog.arraylist.presum.leetcode303;

public class Solution {
    class NumArray {

        int [] preSum;

        public NumArray(int[] nums) {
            preSum = new int[nums.length+1];
            for (int i = 1; i <= nums.length; i++) {
                preSum[i] = preSum[i-1]+nums[i-1];
            }
        }

        public int sumRange(int left, int right) {
            return preSum[right+1]-preSum[left];
        }
    }
}
