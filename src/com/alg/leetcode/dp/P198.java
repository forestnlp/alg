package com.alg.leetcode.dp;

import java.util.Arrays;

public class P198 {
    static class Solution {
        public int rob(int[] nums) {
            int[] memo = new int[nums.length];
            Arrays.fill(memo,-1);
            return robReursive(nums,memo,0);
        }

        public int robReursive(int [] nums,int[] memo,int index){
            if(index>=nums.length) return 0;
            if(memo[index]!=-1) return memo[index];
            int res = Math.max(robReursive(nums,memo,index+1),nums[index]+robReursive(nums,memo,index+2));
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = solution.rob(new int[]{2,7,9,3,1});
        System.out.println(num);
    }
}
