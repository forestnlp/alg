package com.alg.leetcode.array;

public class P26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int slow=0,fast=1;
            while (fast<nums.length) {
                if(nums[fast]!=nums[slow])
                    nums[++slow] = nums[fast];
                fast++;
            }
            return slow+1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P26().new Solution();
        int r = solution.removeDuplicates(new int[]{1,2,3,4});
        System.out.println(r);
    }
}
