package com.alg.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class PM0408M {
    class Solution {

        Map<TreeNode,TreeNode> map = new HashMap<>();

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            dfs(root);
            map.put(root,null);
            TreeNode y = p;
            TreeNode x = q;

            while(y!=null) {
                x = q;
                while(x!=null) {
                    if(x==y) return x;
                    x = map.get(x);
                }
                y = map.get(y);
            }
            return null;
        }

        public void dfs(TreeNode node) {
            if(node==null) return;
            if(node.left!=null) map.put(node.left,node);
            if(node.right!=null) map.put(node.right,node);
            dfs(node.left);
            dfs(node.right);
        }
    }
}
