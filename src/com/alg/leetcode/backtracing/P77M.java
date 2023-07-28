package com.alg.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

public class P77M {
    static class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            backtracing(n,1,k,new ArrayList<>(),ans);
            return ans;
        }

        public void backtracing(int n,int start,int k,List<Integer> curlist,List<List<Integer>> ans) {
            if(curlist.size()==k){
                ans.add(new ArrayList<>(curlist));
                return;
            }

            for(int i=start;i<=n;i++) {
                if(curlist.contains(i)) continue;
                curlist.add(i);
                backtracing(n,i+1,k,curlist,ans);
                curlist.remove(curlist.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combine(4,2));
    }
}
