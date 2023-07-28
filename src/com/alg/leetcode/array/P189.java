package com.alg.leetcode.array;

public class P189 {
    class Solution {
        public void rotate(int[] nums, int k) {
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k%nums.length-1);
            reverse(nums,k%nums.length,nums.length-1);
        }

        public void reverse(int[] nums,int s,int e) {
            while (s<e){
                int tmp = nums[e];
                nums[e]=nums[s];
                nums[s]=tmp;
                s++;
                e--;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new P189().new Solution();
        int[] nums =new int[]{1,2};
        solution.rotate(nums,2);
        for(int n:nums) {
            System.out.println(n);
        }
    }
}
