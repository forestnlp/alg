package com.alg.dog.tree.leetcode114;

import com.alg.dog.tree.TreeNode;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/15 - 06 - 15 - 12:48
 * @Description: com.alg.dog.tree.leetcode114
 * @version: 1.0
 */
public class Solution2 {
    /*该方法不是原地操作，因此不符合题意，但是通过前序遍历的方式很好。*/
    TreeNode dummy = new TreeNode(-1);
    TreeNode p = dummy;

    public void flatten(TreeNode root) {
        if(root==null) return;
        p.right = new TreeNode(root.val);
        p.left = null;
        p = p.right;
        flatten(root.left);
        flatten(root.right);
    }
}
