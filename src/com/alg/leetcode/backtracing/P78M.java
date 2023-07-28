package com.alg.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

public class P78M {
    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            backtracing(nums, ans, new ArrayList<Integer>(), 0);
            return ans;
        }

        private void backtracing(int[] nums, List<List<Integer>> ans, List<Integer> list, int cur) {
            ans.add(new ArrayList<>(list));

            for(int i=cur;i<nums.length;i++){
                list.add(nums[i]);
                backtracing(nums,ans,list,i+1);
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subsets(new int[]{1,2,3}));
    }
}
