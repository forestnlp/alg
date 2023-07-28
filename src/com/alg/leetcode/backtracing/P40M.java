package com.alg.leetcode.backtracing;

import java.util.*;

public class P40M {
    static class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> ans = new ArrayList<>();
            backtracing(candidates,target,new ArrayList<>(),ans,0);
            return ans;
        }

        public void backtracing(int [] candidates, int target, List<Integer> curlist, List<List<Integer>> ans,int start) {
            if(target==0){
                ans.add(new ArrayList<>(curlist));
            }

            for(int i=start;i<candidates.length;i++){
                if(target<candidates[i]) break;

                if(i>start&&candidates[i]==candidates[i-1]){
                    continue;
                }

                curlist.add(candidates[i]);
                backtracing(candidates,target-candidates[i],curlist,ans,i+1);
                curlist.remove(curlist.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int target = 27;
        Solution solution = new Solution();
        System.out.println(solution.combinationSum2(candidates,target));
    }
}
