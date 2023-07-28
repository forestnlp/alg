package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P1110M {
    class Solution {

        List<TreeNode> forest;

        public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
            forest = new ArrayList<>();
            dfs(root, to_delete);
            boolean flag = true;
            for (int v : to_delete) {
                if (v == root.val)
                    flag = false;
            }
            if (flag)
                forest.add(root);
            return forest;
        }

        public TreeNode dfs(TreeNode node, int[] to_delete) {

            if (node == null) return null;

            if (node.left != null)
                node.left = dfs(node.left, to_delete);
            if (node.right != null)
                node.right = dfs(node.right, to_delete);

            for (int v : to_delete) {
                if (v == node.val) {
                    if (node.left != null)
                        forest.add(node.left);
                    if (node.right != null)
                        forest.add(node.right);
                    return null;
                }
            }
            return node;
        }
    }
}
