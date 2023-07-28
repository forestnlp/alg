package com.alg.leetcode.array;

import java.util.Arrays;

public class P561 {
    class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int sum = 0;
            for (int i = 0; i < sum; i += 2) {
                sum += nums[i];
            }
            return sum;
        }
    }
}
