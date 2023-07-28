package com.alg.leetcode.array;

public class P35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int i=0,j=nums.length-1;
            while (i<=j) {
                int m = i+(j-i)/2;
                if(target>nums[m]) {
                    i = m+1;
                }
                else if(target<nums[m]) {
                    j=m-1;
                }
                else
                    return m;
            }
            return i;
        }
    }
}
