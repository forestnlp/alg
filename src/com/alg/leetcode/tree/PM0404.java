package com.alg.leetcode.tree;

public class PM0404 {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root==null) return true;
            return Math.abs(depth(root.left)-depth(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right);
        }

        public int depth(TreeNode node) {
            if(node==null) return 0;
            return Math.max(depth(node.left)+1,depth(node.right)+1);
        }
    }

    public static void main(String[] args) {
        Integer [] array = {3,9,20,null,null,15,7};
        TreeNode node = TreeNode.getInstance(array);
        PM0404 problem = new PM0404();
        Solution solution = problem.new Solution();
        solution.isBalanced(node);
    }
}
