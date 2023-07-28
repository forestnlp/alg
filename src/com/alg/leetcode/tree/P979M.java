package com.alg.leetcode.tree;

public class P979M {
    class Solution {

        int ans = 0;

        public int distributeCoins(TreeNode root) {
            if(root==null) return 0;
            dfs(root);
            return ans;
        }

        public int dfs(TreeNode node) {
            if(node==null) return 0;
            int cur = node.val-1;
            int left = dfs(node.left);
            int right = dfs(node.right);
            ans += Math.abs(left) + Math.abs(right);
            return cur+left+right;
        }
    }
}
