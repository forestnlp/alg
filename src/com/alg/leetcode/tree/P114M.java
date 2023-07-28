package com.alg.leetcode.tree;

public class P114M {
    class Solution {
        public void flatten(TreeNode root) {
            if(root==null) return;
            flatten(root.left);
            flatten(root.right);

            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;

            //找到root.right的最后一个节点，接上去
            while (root.right!=null) root = root.right;
            root.right = temp;
        }
    }
}
