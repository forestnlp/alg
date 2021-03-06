package com.alg.sword.jz34;

import java.util.ArrayList;

public class Solution {
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
        ArrayList<Integer> path = new ArrayList<>();
        helper(ans, path, root, target);
        return ans;
    }

    public void helper(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> path, TreeNode node, int target) {
        if (node == null) return;

        path.add(node.val);

        if (node.left == null && node.right == null && target == node.val) {
            ans.add(new ArrayList<>(path));
            return;
        }


        helper(ans, new ArrayList<>(path), node.left, target - node.val);
        helper(ans, new ArrayList<>(path), node.right, target - node.val);
    }
}