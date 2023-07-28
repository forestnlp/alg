package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PM32 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();

            Queue<TreeNode> que = new LinkedList<>();
            if(root!=null)
                que.offer(root);

            while (!que.isEmpty()) {
                List<Integer> res_level = new ArrayList<>();
                int size = que.size();
                while(size>0) {
                    TreeNode node = que.poll();
                    res_level.add(node.val);
                    size--;
                    if(node.left!=null) que.offer(node.left);
                    if(node.right!=null) que.offer(node.right);
                }
                res.add(res_level);
            }

            return res;
        }
    }
}
