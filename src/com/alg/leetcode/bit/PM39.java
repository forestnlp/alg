package com.alg.leetcode.bit;

public class PM39 {
    class Solution {
        public int majorityElement(int[] nums) {
            int element = -1, ele_size= 0;
            for(int i=0;i<nums.length;i++) {
                if(ele_size==0) element = nums[i];
                ele_size += element==nums[i]?1:-1;
            }
            return element;
        }
    }
}
