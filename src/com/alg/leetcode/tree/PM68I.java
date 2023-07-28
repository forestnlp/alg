package com.alg.leetcode.tree;

public class PM68I {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null) return null;
            if(p==null||q==null) return null;
            if(root.val<p.val&&root.val>q.val) return root;
            if(root.val>p.val&&root.val<q.val) return root;
            if(root.val<p.val&&root.val<q.val) return lowestCommonAncestor(root.right,p,q);
            else return lowestCommonAncestor(root.left,p,q);
        }
    }
}
