package com.alg.leetcode.tree;

public class PM27 {
    class Solution {
        public TreeNode mirrorTree(TreeNode root) {

            if(root==null) return null;

            if(root.left==null&&root.right==null) return root;

            TreeNode node = root.left;
            root.left = root.right;
            root.right = node;

            mirrorTree(root.left);
            mirrorTree(root.right);

            return root;
        }
    }
}
