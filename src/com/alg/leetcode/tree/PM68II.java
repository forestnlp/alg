package com.alg.leetcode.tree;

public class PM68II {
    class Solution {

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

            if(root==null||p==root||q==root) return root;

            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);

            if(left==null) return right;
            if(right==null) return left;

            //题目中p.q 必定存在于树中
            return root;
        }

    }
}
