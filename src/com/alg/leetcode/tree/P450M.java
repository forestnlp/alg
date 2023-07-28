package com.alg.leetcode.tree;

/**
 *
 */
public class P450M {
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if(root==null) return null;
            int val = root.val;

            if (key == val) {
                if(root.left==null) return root.right;
                if(root.right==null) return root.left;
                if(root.left!=null&&root.right!=null){
                    TreeNode newNode = root.right;
                    while (newNode.left != null) newNode = newNode.left;
                    newNode.left = root.left;
                    return root.right;
                }
            }
            if (key > val) {
                root.right = deleteNode(root.right, key);
                return root;
            } else {
                root.left = deleteNode(root.left, key);
                return root;
            }
        }
    }
}
