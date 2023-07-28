package com.alg.leetcode.tree;

public class P865M {
    class Solution {
        public TreeNode subtreeWithAllDeepest(TreeNode root) {
            int ldepth = depth(root.left);
            int rdepth = depth(root.right);

            if (ldepth == rdepth)
                return root;
            if (ldepth > rdepth)
                return subtreeWithAllDeepest(root.left);
            else
                return subtreeWithAllDeepest(root.right);
        }

        public int depth(TreeNode node) {
            if (node == null)
                return 0;
            else
                return Math.max(depth(node.left), depth(node.right)) + 1;
        }
    }
}
