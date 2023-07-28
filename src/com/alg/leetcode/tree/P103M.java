package com.alg.leetcode.tree;

import java.util.*;

public class P103M {
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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


    public static void main(String[] args) {
        Integer [] array = {3,9,20,null,null,15,7};
        TreeNode node = TreeNode.getInstance(array);
        P103M problem = new P103M();
        Solution solution = problem.new Solution();
        System.out.println(solution.zigzagLevelOrder(node));
    }
}
