package com.alg.leetcode.backtracing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P47M {
    class Solution {

        List<List<Integer>> ans;

        public List<List<Integer>> permuteUnique(int[] nums) {
            ans = new ArrayList<>();
            Arrays.sort(nums);
            int[] visited = new int[nums.length];
            List<Integer> path = new ArrayList<>();
            dfs(path,nums,visited);
            return ans;
        }

        public void dfs(List<Integer> path, int[] nums, int[] visited) {

            if(path.size()==nums.length){
                ans.add(new ArrayList<>(path));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                if(visited[i]==1) continue;
                if(i>=1&&nums[i]==nums[i-1]&&visited[i-1]==0){
                    continue;
                }
                path.add(nums[i]);
                visited[i]=1;
                dfs(path, nums,visited);
                path.remove(path.size() - 1);
                visited[i]=0;
            }
        }
    }
}
