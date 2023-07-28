package com.alg.leetcode.tree;

public class P988M {

    class Solution {

        String ans = "~";
        StringBuilder path;
        public String smallestFromLeaf(TreeNode root) {
            path = new StringBuilder();
            dfs(root);
            return ans;
        }

        public void dfs(TreeNode node) {
            if(node==null) return;

            char c = (char) ('a'+node.val);

            path.append(c);

            if(node.left==null&&node.right==null) {
                String temp = path.reverse().toString();
                if(temp.compareTo(ans)<0)
                    ans = temp;
                path = path.reverse();
            }

            dfs(node.left);
            dfs(node.right);

            path.deleteCharAt(path.length()-1);
        }
    }

    public static void main(String[] args) {
        Integer [] array = {0,1,2,3,4,3,4};
        TreeNode node = TreeNode.getInstance(array);
        P988M problem = new P988M();
        Solution solution = problem.new Solution();
        String res = solution.smallestFromLeaf(node);
        System.out.println(res);
    }
}
