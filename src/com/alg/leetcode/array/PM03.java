package com.alg.leetcode.array;

public class PM03 {
    class Solution {
        public int findRepeatNumber(int[] nums) {
            int [] buckets = new int[nums.length];
            for(int n:nums) {
                buckets[n]++;
                if(buckets[n]>1) return n;
            }
            return -1;
        }
    }
}
