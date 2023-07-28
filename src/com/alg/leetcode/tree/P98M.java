package com.alg.leetcode.tree;

public class P98M {

    TreeNode pre = null;
    boolean isValid = true;

    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        return isValid;
    }

    public void inOrder(TreeNode node) {
        if(node==null) return;

        if(!isValid) return;

        inOrder(node.left);

        if(pre!=null&&pre.val>=node.val)
            isValid = false;
        pre = node;

        inOrder(node.right);
    }
}
