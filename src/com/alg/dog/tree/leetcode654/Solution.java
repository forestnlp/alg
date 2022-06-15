package com.alg.dog.tree.leetcode654;

import com.alg.dog.tree.TreeNode;

public class Solution {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        TreeNode root = helper(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode helper(int[] nums, int from, int to) {

        if (nums == null || nums.length == 0 || from > to) return null;

        int index = -1, maxval = Integer.MIN_VALUE;

        for (int i = from; i <= to; i++) {
            if (nums[i] > maxval) {
                maxval = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(maxval);
        TreeNode left = helper(nums, from, index - 1);
        TreeNode right = helper(nums, index + 1, to);
        root.left = left;
        root.right = right;
        return root;
    }
}