package com.alg.leetcode.tree;

public class PM1712 {
    class Solution {
        TreeNode newRoot ;
        TreeNode pre;

        public TreeNode convertBiNode(TreeNode root) {
            newRoot = new TreeNode(-1);
            pre = newRoot;
            inOrder(root);
            return newRoot.right;
        }

        public void inOrder(TreeNode node) {
            if(node==null) return;
            inOrder(node.left);
            pre.right = new TreeNode(node.val);
            pre.left = null;
            pre = pre.right;
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        Integer [] array = {4,2,5,1,3,null,6,0};
        TreeNode node = TreeNode.getInstance(array);
        PM1712 problem = new PM1712();
        Solution solution = problem.new Solution();
        TreeNode res = solution.convertBiNode(node);
    }
}
