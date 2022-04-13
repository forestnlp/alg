package com.alg.sword.jz79;

public class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null) return true;
        if(!IsBalanced_Solution(root.left)||!IsBalanced_Solution(root.right)) return false;
        if(Math.abs(depth(root.left)-depth(root.right))<=1){
            return true;
        }
        return false;
    }

    public int depth(TreeNode node){
        if(node==null) return 0;
        return Math.max(depth(node.left),depth(node.right))+1;
    }
}