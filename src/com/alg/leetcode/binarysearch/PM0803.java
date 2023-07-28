package com.alg.leetcode.binarysearch;

public class PM0803 {
    class Solution {
        public int findMagicIndex(int[] nums) {
            for(int i=0;i<nums.length;i++) {
                if(nums[i]==i) return i;
                if(nums[i]>i&&nums[i]<nums.length) {
                    i = nums[i]-1;
                }
            }
            return -1;
        }
    }
}
