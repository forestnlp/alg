package com.alg.leetcode.tree;

public class P965 {
    class Solution {
        public boolean isUnivalTree(TreeNode root) {
            if(root==null) return true;
            if(root.left==null&&root.right==null) return true;

            boolean isleftUnival = true ,isrightUnival=true;

            if(root.left!=null){
                isleftUnival = (root.left.val==root.val)&&isUnivalTree(root.left);
            }

            if(root.right!=null){
                isrightUnival = (root.right.val==root.val)&&isUnivalTree(root.right);
            }

            return isleftUnival&&isrightUnival;
        }
    }
}
