package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P637 {
    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> avgs = new ArrayList<>();

            Queue<TreeNode> queue = new LinkedList<>();

            if(root!=null) {
                queue.offer(root);
            }

            while(!queue.isEmpty()) {
                double sum = 0;
                int count = 0;
                int length = queue.size();
                int i = 0;
                while(i<length) {
                    TreeNode node = queue.poll();
                    sum += node.val;
                    count++;

                    if(node.left!=null) queue.offer(node.left);
                    if(node.right!=null) queue.offer(node.right);
                    i++;
                }
                avgs.add(sum / count);
            }

            return avgs;
        }
    }
}
