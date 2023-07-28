package com.alg.leetcode.tree;

public class P1315M {
    class Solution {
        public int sumEvenGrandparent(TreeNode root) {
            int sum = 0;

            if(root==null) return sum;

            TreeNode left = root.left;
            TreeNode right = root.right;

            int val = root.val;

            sum += sumEvenGrandparent(left);
            sum += sumEvenGrandparent(right);

            if(val%2==0)
                sum += sumGrandson(root);

            return sum;
        }

        public int sumGrandson(TreeNode node){
            int sum = 0;

            if(node==null) return sum;

            TreeNode left = node.left;
            TreeNode right = node.right;

            if(left!=null) {
                if(left.left!=null) sum+=left.left.val;
                if(left.right!=null) sum+=left.right.val;
            }

            if(right!=null) {
                if(right.left!=null) sum+=right.left.val;
                if(right.right!=null) sum+=right.right.val;
            }

            return sum;
        }
    }
}
