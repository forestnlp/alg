package com.alg.leetcode.tree;

public class PM0405M {
    class Solution {
        TreeNode pre;
        boolean valid;
        public boolean isValidBST(TreeNode root) {
            valid = true;
            dfs(root);
            return valid;
        }

        public void dfs(TreeNode node) {
            if(node==null) return;
            dfs(node.left);
            if(pre!=null&&pre.val>node.val) {
                valid = false;
                return;
            }
            dfs(node.right);
            pre = node;
        }
    }
}
