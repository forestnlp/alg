package com.alg.leetcode.array;

public class P674 {
    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            if(nums==null||nums.length==0) return 0;
            int maxlen = 0;
            int len =1;
            int prev = Integer.MIN_VALUE;
            for(int i=0;i<nums.length-1;i++) {
                if(nums[i]<nums[i+1]){
                    len++;
                }
                else {
                    len = 1;
                }
                maxlen = Math.max(len,maxlen);
            }
            return Math.max(len,maxlen);
        }
    }
}
