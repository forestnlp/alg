package com.alg.leetcode.tree;

public class P108 {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return helper(0, nums.length - 1, nums);
        }

        public TreeNode helper(int p, int q, int[] nums) {
            if (p > q) return null;
            int c = (p + q) % 2 == 0 ? (p + q) / 2 : (p + q) / 2 + 1;
            TreeNode root = new TreeNode(nums[c]);
            root.left = helper(p, c - 1, nums);
            root.right = helper(c + 1, q, nums);
            return root;
        }
    }
}
