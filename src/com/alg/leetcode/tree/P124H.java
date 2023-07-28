package com.alg.leetcode.tree;

public class P124H {
    class Solution {

        int maxPath = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            dfs(root);
            return maxPath;
        }

        public int dfs(TreeNode node) {
            if(node==null) return 0;

            int lmax = dfs(node.left);
            int rmax = dfs(node.right);

            int curmax = node.val+Math.max(0,lmax)+Math.max(0,rmax);
            if(curmax>maxPath) maxPath = curmax;

            return Math.max(Math.max(node.val+lmax,node.val+rmax),node.val);
        }
    }
}
