package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P113IIM {

    class Solution {

        List<List<Integer>> res = new ArrayList<>();

        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            dfs(root, new ArrayList<Integer>(), sum);
            return res;
        }

        public void dfs(TreeNode node, List<Integer> path, int sum) {
            if (node == null) return;

            path.add(node.val);

            sum -= node.val;

            if (sum == 0 && node.left == null && node.right == null) {
                res.add(new ArrayList<Integer>(path));
            }


            dfs(node.left, path, sum);
            dfs(node.right, path, sum);

            path.remove(path.size() - 1);
        }
    }
}
