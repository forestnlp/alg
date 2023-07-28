package com.alg.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

public class P22M {
    static class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> ans = new ArrayList<>();
            backtracing("",0,0,ans,n);
            return ans;
        }

        public void backtracing(String str,int leftP,int rightP,List<String> ans,int n){
            if(leftP==n&&rightP==n){
                ans.add(str);
                return;
            }
            if(leftP<rightP) return;

            if(leftP<n) backtracing(str+"(",leftP+1,rightP,ans,n);
            if(rightP<n) backtracing(str+")",leftP,rightP+1,ans,n);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(10));
    }
}
