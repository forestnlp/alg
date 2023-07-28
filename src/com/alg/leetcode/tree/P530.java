package com.alg.leetcode.tree;

/**
 * Created by mac on 2020/6/5.
 */
public class P530 {

    class Solution {

        int min = Integer.MAX_VALUE;

        TreeNode pre;

        public int getMinimumDifference(TreeNode root) {

            if(root==null) return 0;

            InOrder(root);

            return min;
        }

        public void InOrder(TreeNode node) {

            if(node==null) return;

            InOrder(node.left);

            if(pre!=null) {
                if(Math.abs(pre.val-node.val)<min)
                    min = Math.abs(pre.val-node.val);
            }

            pre = node;

            InOrder(node.right);
        }
    }
}
