package com.alg.leetcode.tree;

public class P938 {
    class Solution {

        int sum=0;

        public int rangeSumBST(TreeNode root, int L, int R) {
            inOrderOptim(root,L,R);
            return sum;
        }

        public void inOrder(TreeNode node,int L,int R){
            if(node==null) return;
            if(node.val>=L&&node.val<=R) sum+=node.val;
            inOrder(node.left,L,R);
            inOrder(node.right,L,R);
        }

        //这道题还可以剪枝
        public void inOrderOptim(TreeNode node,int L,int R){
            if(node==null) return;
            if(node.val>=L&&node.val<=R) {
                inOrderOptim(node.left,L,R);
                inOrderOptim(node.right,L,R);
                sum+=node.val;
            }
            if(node.val<=L) inOrderOptim(node.right,L,R);
            if(node.val>=R) inOrderOptim(node.left,L,R);
        }
    }
}

