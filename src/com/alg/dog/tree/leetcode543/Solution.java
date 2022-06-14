package com.alg.dog.tree.leetcode543;

import com.alg.dog.tree.TreeNode;

public class Solution {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        int curMax = leftMax + rightMax;
        max = Math.max(curMax, max);
        return 1 + Math.max(leftMax, rightMax);
    }
}
