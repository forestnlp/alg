package com.alg.dog.tree.leetcode104;

import com.alg.dog.tree.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int depth = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        return depth;
    }
}