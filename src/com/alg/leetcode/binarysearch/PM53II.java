package com.alg.leetcode.binarysearch;

public class PM53II {
    class Solution {

        int missing = -1;

        public int missingNumber(int[] nums) {
            if(nums==null) return -1;
            int start = 0;
            int end = nums.length-1;
            binarySearch(nums,start,end);
            return missing==-1?end+1:missing;
        }

        public void binarySearch(int[] nums,int start,int end) {
            if(start>end) return;
            if(start==end && nums[start]!=start) {
                missing=start;
                return;
            }
            int mid = start+(end-start)/2;
            if(mid!=nums[mid]) binarySearch(nums,start,mid);
            else binarySearch(nums,mid+1,end);
        }
    }

    public static void main(String[] args) {
        Solution solution = new PM53II().new Solution();
        int res = solution.missingNumber(new int[]{0,1,3});
        System.out.println(res);
    }
}
