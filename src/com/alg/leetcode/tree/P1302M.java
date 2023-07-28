package com.alg.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class P1302M {
    class Solution {
        public int deepestLeavesSum(TreeNode root) {
            int sum=0;
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);
            while (!que.isEmpty()){
                sum=0;
                int n = que.size();
                for(int i=0;i<n;i++) {
                    TreeNode node = que.poll();
                    sum+=node.val;
                    if(node.left!=null) que.offer(node.left);
                    if(node.right!=null) que.offer(node.right);
                }
            }
            return sum;
        }
    }
}
