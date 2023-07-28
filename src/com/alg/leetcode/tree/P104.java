package com.alg.leetcode.tree;

public class P104 {
    class Solution {
        public int maxDepth(TreeNode root) {
            return root==null?0:1+Math.max(maxDepth(root.left),maxDepth(root.right));
        }
    }
}
