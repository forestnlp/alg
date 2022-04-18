package com.alg.sword.jz34;

import java.util.ArrayList;
import java.util.Stack;

public class Solution2 {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Stack<Integer> path = new Stack<>();
        helper(ans, path, root, target);
        return ans;
    }

    public void helper(ArrayList<ArrayList<Integer>> ans, Stack<Integer> path, TreeNode node, int target) {

        if (node == null) return;
        if (node.left == null && node.right == null && target == node.val) {
            path.push(node.val);
            ans.add(new ArrayList<>(path));
            return;
        }

        path.push(node.val);
        helper(ans, path, node.left, target - node.val);
        path.pop();

        path.push(node.val);
        helper(ans, path, node.right, target - node.val);
        path.pop();
    }
}