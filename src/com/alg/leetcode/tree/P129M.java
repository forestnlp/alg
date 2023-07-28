package com.alg.leetcode.tree;

public class P129M {
    class Solution {

        int sum ;

        public int sumNumbers(TreeNode root) {
            sum = 0;
            dfs(root,0);
            return sum;
        }

        public void dfs (TreeNode node,int num) {
            if(node==null) return;
            int temp = num*10+node.val;
            if(node.left==null&&node.right==null)
                sum +=temp;
            dfs(node.left,temp);
            dfs(node.right,temp);
        }

    }
}
