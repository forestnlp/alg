package com.alg.leetcode.tree;

public class PM28 {
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root==null) return true;
            return helper(root.left,root.right);
        }

        public boolean helper(TreeNode left,TreeNode right) {
            if(left==null) return (right==null);
            if(right==null) return (left==null);
            if(left.val == right.val)
                return helper(left.left,right.right)&&helper(left.right,right.left);
            return false;
        }
    }
}
