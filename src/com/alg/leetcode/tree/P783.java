package com.alg.leetcode.tree;

public class P783 {
    class Solution {

        int min=Integer.MAX_VALUE;
        TreeNode pre;

        public int minDiffInBST(TreeNode root) {
            inOrder(root);
            return min;
        }

        public void inOrder(TreeNode node) {
            if(node==null) return;

            inOrder(node.left);

            //todo
            if(pre!=null)
                min=Math.min(min,node.val-pre.val);

            pre = node;

            inOrder(node.right);
        }
    }
}
