package com.alg.dog.tree.bst.leetcode700;

import com.alg.dog.tree.TreeNode;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val<val) return searchBST(root.right,val);
        else if(root.val==val) return root;
        else return searchBST(root.left,val);
    }
}