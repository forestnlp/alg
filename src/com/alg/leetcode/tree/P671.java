package com.alg.leetcode.tree;

import java.util.*;

public class P671 {
    class Solution {
        public int findSecondMinimumValue(TreeNode root) {
            Queue<TreeNode> que = new LinkedList<>();
            que.add(root);
            int min = root.val;
            int sec = Integer.MAX_VALUE;
            boolean hasSec = false;

            while(!que.isEmpty()) {
                TreeNode node = que.poll();

                if(node.val<=sec&&node.val>min) {
                    sec = node.val;
                    hasSec = true;
                }

                if(node.left!=null) {
                    que.offer(node.left);
                    que.offer(node.right);
                }
            }
            if(hasSec) return sec;
            return -1;
        }
    }

    class Solution2 {
        public int findSecondMinimumValue(TreeNode root) {
            Queue<TreeNode> que = new LinkedList<>();
            que.add(root);
            int min = root.val;

            Set<Integer> vals = new HashSet<>();

            while(!que.isEmpty()) {
                List<TreeNode> nodes = new ArrayList<>();
                int size = que.size();
                for(int i=0;i<size;i++) {
                    TreeNode n = que.poll();
                    vals.add(n.val);
                    nodes.add(n);
                }
                for(TreeNode n:nodes) {
                    if(n.left!=null) que.offer(n.left);
                    if(n.right!=null) que.offer(n.right);
                }
            }
            int sec =min;
            while(!vals.isEmpty())
            {
                sec = Collections.min(vals);
                if(sec>min) return sec;
                vals.remove(sec);
            }
            return -1;
        }
    }
}
