package com.alg.leetcode.tree;

public class P404 {
    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {

            int sum = 0;

            if(root==null) return 0;

            if(root.left!=null) {
                TreeNode left = root.left;
                if(left.left==null&&left.right==null)
                    sum += left.val;
            }

            sum += sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);

            return sum;
        }
    }
}
