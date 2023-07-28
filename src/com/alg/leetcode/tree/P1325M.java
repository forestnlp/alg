package com.alg.leetcode.tree;

public class P1325M {
    class Solution {
        public TreeNode removeLeafNodes(TreeNode root, int target) {
            root = dfs(root,target);
            return root;
        }

        public TreeNode dfs(TreeNode node,int target) {
            if(node==null) return null;
            node.left = dfs(node.left,target);
            node.right = dfs(node.right,target);
            if(node.val==target) {
                if(node.left==null&&node.right==null)
                    return null;
            }
            return node;
        }
    }
}
