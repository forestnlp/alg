package com.alg.sword.jz28;

public class Solution {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot==null) return true;
        return symmetrical(pRoot.left,pRoot.right);
    }

    boolean symmetrical(TreeNode left,TreeNode right) {
        if(left==null) return right==null;
        if(right==null) return left==null;
        if(left.val!=right.val) return false;
        return symmetrical(left.right,right.left) && symmetrical(left.left,right.right);
    }
}