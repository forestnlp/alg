package com.alg.leetcode.tree;

public class P111 {
    class Solution {
        public int minDepth(TreeNode root) {
             if(root==null) return 0;
             if(root.right==null&&root.left==null) return 1;
             if(root.right==null||root.left==null) return minDepth(root.right)+minDepth(root.left)+1;
             return 1+Math.min(minDepth(root.right),minDepth(root.left));
        }
    }
}
