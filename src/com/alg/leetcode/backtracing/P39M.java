package com.alg.leetcode.backtracing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P39M {

    static class Solution {

        List<List<Integer>> ans;

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            ans = new ArrayList<>();
            backtrace(candidates, target, 0,new ArrayList<Integer>(),0);
            return ans;
        }

        public void backtrace(int[] candidates, int target, int start,List<Integer> trace,int cursum) {
            if(cursum==target) {
                ans.add(new ArrayList<>(trace));
                return;
            }

            for(int i=start;i<candidates.length;i++){
                int cd = candidates[i];
                if(cursum+cd>target) continue;
                trace.add(cd);
                backtrace(candidates,target,i,trace,cursum+cd);
                trace.remove(trace.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> list = solution.combinationSum(new int[]{2,2,3,5,7,4,2},7);
        System.out.println(list);
    }
}
