package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PM32IIM {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null) return res;
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);

            int lvl = 0;

            while (!que.isEmpty()) {
                int k = que.size();
                List<Integer> res_lvl = new ArrayList<>();
                for (int i = 0; i < k; i++) {
                    TreeNode node = que.poll();
                    if (node.left != null) que.offer(node.left);
                    if (node.right != null) que.offer(node.right);
                    if(lvl%2==0) res_lvl.add(node.val);
                    else res_lvl.add(0,node.val);

                }
                lvl++;
                res.add(res_lvl);
            }
            return res;
        }
    }
}
