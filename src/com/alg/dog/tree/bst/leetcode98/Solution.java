package com.alg.dog.tree.bst.leetcode98;

import com.alg.dog.tree.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        helper(root);
        return isValid;
    }

    boolean isValid = true;
    TreeNode pre = null;

    public void helper(TreeNode root){
        if(root==null) return;

        helper(root.left);

        if(pre!=null && root.val<=pre.val) {
            isValid=false;
            return;
        }

        pre = root;

        helper(root.right);
    }
}