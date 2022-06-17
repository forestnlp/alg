package com.alg.dog.tree.bst.leetcode538;

import com.alg.dog.tree.TreeNode;

public class Solution {

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if(root==null) return null;
        helper(root);
        return root;
    }

    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.right);
        root.val = root.val+sum;
        sum = root.val;
        helper(root.left);
    }
}