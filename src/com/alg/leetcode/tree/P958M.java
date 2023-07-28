package com.alg.leetcode.tree;

public class P958M {
    class Solution {
        int maxnum;
        int size;
        public boolean isCompleteTree(TreeNode root) {
            dfs(root,1);
            return maxnum==size;
        }

        public void dfs(TreeNode node,int num) {
            if(node==null) return;
            if(num>maxnum) maxnum = num;
            size++;
            dfs(node.left,2*num);
            dfs(node.right,2*num+1);
        }
    }
}
