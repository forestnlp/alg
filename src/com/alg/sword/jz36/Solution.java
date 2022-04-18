package com.alg.sword.jz36;


import java.util.ArrayDeque;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        TreeNode left = pRootOfTree;
        while (left.left!=null){
            left = left.left;
        }
        helper(pRootOfTree);
        return left;
    }

    TreeNode pre = null;
    public void helper(TreeNode root) {
        if (root == null) return ;
        helper(root.left);
        root.left = pre;
        if(pre!=null) pre.right = root;
        pre = root;
        helper(root.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode3.left = treeNode4;
        treeNode4.left = treeNode5;
       print(treeNode1);

        TreeNode root = solution.Convert(treeNode1);
        printlist(root);
    }

    public static void print(TreeNode root){
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root!=null) queue.offer(root);
        int level = 1;
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                System.out.print(node.val+"\t");
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            System.out.println();
        }
    }

    public static void printlist(TreeNode left){
        while (left!=null){
            System.out.println(left.val+" \t"+left + " left.right="+left.right+ " left.left="+left.left);
            left = left.right;
        }
    }
}