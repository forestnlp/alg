package com.alg.leetcode.tree;

public class P513M {
    class Solution {
        int maxdepth = 0;
        TreeNode bottom_left_node = null;

        public int findBottomLeftValue(TreeNode root) {
            helper(root,1);
            return bottom_left_node.val;
        }

        public void helper(TreeNode node,int depth) {
            if(node==null) return;
            if(depth>maxdepth&&node.left==null&&node.right==null) {
                maxdepth = depth;
                bottom_left_node = node;
            }
            helper(node.left,depth+1);
            helper(node.right,depth+1);
        }
    }
}
