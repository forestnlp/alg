package com.alg.leetcode.tree;

public class P1145M {
    class Solution {
        public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
            if(root==null) return false;
            TreeNode xNode = findX(root,x);
            int leftNum = dfs(xNode.left);
            int rightNum = dfs(xNode.right);
            int otherNum = n - leftNum - rightNum -1;

            int max = Math.max(otherNum,Math.max(leftNum,rightNum));
            if(max>n/2) return true;
            return false;
        }

        public TreeNode findX(TreeNode node,int x) {
            System.out.println(node);
            if(node==null) return null;
            if(node.val==x) return node;
            return findX(node.left,x)==null?findX(node.right,x):findX(node.left,x);
        }

        public int dfs(TreeNode node) {
            if(node==null) return 0;
            return dfs(node.left)+dfs(node.right)+1;
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.getInstance(new Integer[]{1,2,3});
        Solution solution = new P1145M().new Solution();
        solution.btreeGameWinningMove(root,3,2);
    }
}
