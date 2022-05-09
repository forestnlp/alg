package com.alg.dog.arraylist.presum.leetcode124;

public class Leetcode124 {
    class Solution {
        int res = 0;
        public int maxPathSum(TreeNode root) {
            if(root==null) return 0;
            int left = maxPathSum(root.left);
            int right = maxPathSum(root.right);
            int pathval = root.val+left+right;
            res = Math.max(pathval,res);
            return res;
        }
    }
}
