package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P102M {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null) return res;
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);
            while (!que.isEmpty()) {
                int k = que.size();
                List<Integer> res_lvl = new ArrayList<>();
                for (int i = 0; i < k; i++) {
                    TreeNode node = que.poll();
                    res_lvl.add(node.val);
                    if (node.left != null) que.offer(node.left);
                    if (node.right != null) que.offer(node.right);
                }
                res.add(res_lvl);
            }
            return res;
        }
    }
}
