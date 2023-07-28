package com.alg.leetcode.dp;

public class PM303 {
    class NumArray {

        int[] acc;

        public NumArray(int[] nums) {
            acc = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                acc[i + 1] = acc[i] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            return acc[j + 1] - acc[i];
        }
    }

}
