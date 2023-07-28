package com.alg.leetcode.tree;

public class P897 {

    class Solution {

        TreeNode dummy = new TreeNode(0);
        TreeNode curNode;

        public TreeNode increasingBST(TreeNode root) {
            inOrder(root);
            return dummy.right;
        }

        public void inOrder(TreeNode node) {
            if(node==null) return;

            inOrder(node.left);

            TreeNode newNode = new TreeNode(node.val);
            if(curNode==null) {
                curNode = newNode;
                dummy.right = curNode;
            }
            else{
                curNode.right = newNode;
                curNode = newNode;
            }

            inOrder(node.right);
        }
    }
}
