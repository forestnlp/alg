package com.alg.leetcode.binarysearch;

public class P162M {
    class Solution {
        public int findPeakElement(int[] nums) {
            int l = 0,r = nums.length-1;
            while (l<r) {
                int m = l + (r-l)/2;
                if(nums[m]<nums[m+1])
                    l = m+1;
                else
                    r = m;
            }
            return r;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P162M().new Solution();
        int r = solution.findPeakElement(new int[]{1,5,8,3,9,10,2});
        System.out.println(r);
    }
}
