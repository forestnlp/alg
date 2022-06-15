package com.alg.dog.tree.leetcode114;

import com.alg.dog.tree.TreeNode;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/15 - 06 - 15 - 12:55
 * @Description: com.alg.dog.tree.leetcode114
 * @version: 1.0
 */
public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        flatten(root.right);
        //左右交换
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = left;
        //原来的right放到left的最后
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}
