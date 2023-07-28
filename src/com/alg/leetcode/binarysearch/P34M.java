package com.alg.leetcode.binarysearch;

public class P34M {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int l = 0, r = nums.length - 1;
            int lmost, rmost;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (nums[m] == target) {
                    for (lmost = m; lmost>0&&nums[lmost - 1] == target; lmost--) ;
                    for (rmost = m; rmost<nums.length-1&&nums[rmost + 1] == target; rmost++) ;
                    return new int[]{lmost, rmost};
                } else if (target < nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            }
            return new int[]{-1, -1};
        }
    }
}
