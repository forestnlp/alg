package com.alg.leetcode.array;

public class P1413 {
    class Solution {
        public int minStartValue(int[] nums) {
            int startValue = 1;
            int sum  = 0;
            for(int i=0;i<nums.length;i++) {
                sum+=nums[i];
                if(sum+startValue<1) {
                    startValue = 1-sum;
                }
            }
            return startValue;
        }
    }
}
