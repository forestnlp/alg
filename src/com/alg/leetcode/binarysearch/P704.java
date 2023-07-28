package com.alg.leetcode.binarysearch;

public class P704 {
    class Solution {
        public int search(int[] nums, int target) {
            int i=0,j=nums.length-1,m;
            while (i<=j) {
                m = i+(j-i)/2;
                if(nums[m]==target) return m;
                else if(target<nums[m]) j=m-1;
                else i=m+1;
            }
            return -1;
        }
    }
}
