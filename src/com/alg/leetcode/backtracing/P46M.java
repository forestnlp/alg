package com.alg.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

public class P46M {
    class Solution {

        List<List<Integer>> ans;

        public List<List<Integer>> permute(int[] nums) {
            ans = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            dfs(path,nums);
            return ans;
        }

        public void dfs(List<Integer> path, int[] nums) {

            if(path.size()==nums.length)
                ans.add(new ArrayList<>(path));

            for (int i = 0; i < nums.length; i++) {
                if(path.contains(nums[i])) continue;
                path.add(nums[i]);
                dfs(path, nums);
                path.remove(path.size() - 1);
            }
        }
    }
}
