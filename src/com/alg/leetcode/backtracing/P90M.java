package com.alg.leetcode.backtracing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P90M {
    static class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            backtracing(nums,0,ans,new ArrayList<>());
            return ans;
        }

        public void backtracing(int[] nums,int start,List<List<Integer>> ans,List<Integer> curlist) {
            ans.add(new ArrayList<>(curlist));
            for(int i=start;i<nums.length;i++) {
                if(i>start&&nums[i]==nums[i-1]) continue;
                curlist.add(nums[i]);
                backtracing(nums,i+1,ans,curlist);
                curlist.remove(curlist.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Solution solution = new Solution();
        System.out.println(solution.subsetsWithDup(nums));
    }
}
