package com.alg.leetcode.tree;

public class P814M {
    class Solution {
        public TreeNode pruneTree(TreeNode root) {
            if(root==null) return null;
            pruneTree(root.left);
            pruneTree(root.right);
            if(allZero(root.left)) root.left = null;
            if(allZero(root.right)) root.right = null;
            return root;
        }

        public boolean allZero(TreeNode node) {
            if(node==null) return true;
            return node.val==0&&allZero(node.left)&&allZero(node.right);
        }
    }
}
