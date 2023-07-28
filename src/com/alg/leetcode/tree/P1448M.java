package com.alg.leetcode.tree;

public class P1448M {
    class Solution {

        int cnt;

        public int goodNodes(TreeNode root) {
            cnt=0;
            dfs(root,Integer.MIN_VALUE);
            return cnt;
        }

        public void dfs(TreeNode node,int max) {
            if(node==null) return;
            if(node.val>=max){
                max = node.val;
                cnt++;
            }
            dfs(node.left,max);
            dfs(node.right,max);
        }
    }
}
