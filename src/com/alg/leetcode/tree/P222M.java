package com.alg.leetcode.tree;

public class P222M {
    class Solution {
        public int countNodes(TreeNode root) {
            if (root == null) return 0;
            int leftdepth = depth(root.left);
            int rightdepth = depth(root.right);

            if (leftdepth == rightdepth)
                return (int) (Math.pow(2,leftdepth) + countNodes(root.right));
            else
                return (int) (Math.pow(2,rightdepth) + countNodes(root.left));
        }

        //对于完全二叉树而言，这种方法求深度成本低
        public int depth(TreeNode node) {
            int depth = 0;
            while (node != null) {
                node = node.left;
                depth++;
            }
            return depth;
        }
    }
}
