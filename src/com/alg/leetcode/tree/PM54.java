package com.alg.leetcode.tree;

public class PM54 {

    class Solution {

        int i=0,j;
        int val;
        public int kthLargest(TreeNode root, int k) {
            j=k;
            inOrder(root);
            return val;
        }

        public void inOrder(TreeNode node) {
            if(node==null) return;
            inOrder(node.right);
            i++;
            if(i==j) {
                val=node.val;
                return;
            }
            inOrder(node.left);
        }
    }

    public static void main(String[] args) {
        Integer [] array = {3,1,4,null,2};
        TreeNode node = TreeNode.getInstance(array);
        PM54 problem = new PM54();
        Solution solution = problem.new Solution();
        int res = solution.kthLargest(node,1);
        System.out.println(res);
    }
}
