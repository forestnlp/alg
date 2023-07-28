package com.alg.leetcode.tree;

public class P230M {
    class Solution {

        int times = 0;
        int res;
        public int kthSmallest(TreeNode root, int k) {
            inorder(root,k);
            return res;
        }

        public void inorder(TreeNode node,int k) {
            if(node==null) return;
            inorder(node.left,k);
            times++;
            if(times==k) res = node.val;
            inorder(node.right,k);
        }
    }
}
