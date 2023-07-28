package com.alg.leetcode.tree;

public class P236M {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            //考虑p是q的爸爸 或者q是p的爸爸，那么此时只要root==p或者root==q。那么返回root就是他们的公共祖先
            //但是有一种情况，就是虽然root==p.但是他的孩子没有等于q的。那么此时，应该在另一条路径中有等于q的。
            if(root==null) return null;

            if(root.val==p.val||root.val==q.val)
                return root;

            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);

            //说明left中和right中有一个p和一个q
            if(left!=null&&right!=null) {
                return root;
            }
            else {
                if(left==null) return right;
                else return left;
            }
        }
    }
}
