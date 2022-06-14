package com.alg.dog.tree.leetcode226;

import com.alg.dog.tree.TreeNode;

public class Solution {

    public TreeNode invertTree(TreeNode root) {

        if(root==null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;

    }

}
