package com.alg.dog.tree.bst.leetcode230;

import com.alg.dog.tree.TreeNode;

public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return ans;
    }

    int rank = 0;
    int ans = 0;

    public void helper(TreeNode root, int k) {
        if (root == null) return;
        helper(root.left, k);
        rank++;
        if (rank == k) {
            ans = root.val;
            return;
        }
        helper(root.right, k);
    }
}