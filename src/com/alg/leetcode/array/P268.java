package com.alg.leetcode.array;

public class P268 {
    class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int sum = n * (1+n) / 2;
            for (int num : nums)
                sum -= num;

            return sum;
        }
    }
}
