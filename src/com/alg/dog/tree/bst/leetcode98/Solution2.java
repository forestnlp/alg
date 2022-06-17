package com.alg.dog.tree.bst.leetcode98;

import com.alg.dog.tree.TreeNode;

public class Solution2 {

    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }

    public boolean helper(TreeNode root,TreeNode min,TreeNode max){
        if(root==null) return true;
        if(min!=null&&min.val>=root.val) return false;
        if(max!=null&&max.val<=root.val) return false;
        return helper(root.left,min,root)&&helper(root.right,root,max);
    }
}