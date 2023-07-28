package com.alg.leetcode.array;

public class PM1704 {
    class Solution {
        public int missingNumber(int[] nums) {
            int res=0;
            int n = nums.length;
            for(int i=0;i<n;i++) {
                res = res^i;
                res = res^nums[i];
            }
            res = res^n;
            return res;
        }
    }
}
