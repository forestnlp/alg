package com.alg.leetcode.tree;

/**
 * 必须左右两个子树深度相等 才是解
 */
public class P1123M {
    class Solution {
        public TreeNode lcaDeepestLeaves(TreeNode root) {

            int leftSubTreeDepth = depth(root.left);
            int rightSubTreeDepth = depth(root.right);

            if(leftSubTreeDepth==rightSubTreeDepth) return root;

            return leftSubTreeDepth>rightSubTreeDepth?lcaDeepestLeaves(root.left):lcaDeepestLeaves(root.right);
        }

        public int depth(TreeNode node) {
            if(node==null) return 0;
            else
                return Math.max(depth(node.left),depth(node.right))+1;
        }
    }
}
