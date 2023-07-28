package com.alg.leetcode.array;

import java.util.Arrays;

public class P581 {
    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int[] sortednums = nums.clone();
            Arrays.sort(sortednums);

            int start=nums.length-1,end=0;
            for(int i=0;i<nums.length;i++) {
                if(nums[i]!=sortednums[i]) {
                    start = Math.min(start,i);
                    end = Math.max(end,i);
                }
            }
            return end<start?0:end-start+1;
        }
    }
}
