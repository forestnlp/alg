package com.alg.leetcode.tree;


public class P1372M {
    class Solution {
        int longest = 0;

        public int longestZigZag(TreeNode root) {
            if (root == null) return 0;
            helper(root.left, 1, 0);
            helper(root.right, 0, 0);
            return longest;
        }

        public void helper(TreeNode node, int leftchild, int distance) {
            if(node==null) return;
            distance+=1;
            longest = Math.max(distance, longest);
            if (leftchild==1) {
                helper(node.right, 0, distance);
                helper(node.left, 1, 0);
            } else {
                helper(node.left,1, distance );
                helper(node.right, 0, 0);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.getInstance(new Integer[]{1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1});
        Solution solution = new P1372M().new Solution();
        int longest = solution.longestZigZag(root);
        System.out.println(longest);
    }
}
