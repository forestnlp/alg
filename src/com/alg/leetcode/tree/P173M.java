package com.alg.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class P173M {
    class BSTIterator {
        Queue<Integer> que = new LinkedList<>();
        public BSTIterator(TreeNode root) {
            dfs(root);
        }

        private void dfs(TreeNode node) {
            if(node==null) return;
            dfs(node.left);
            que.offer(node.val);
            dfs(node.right);
        }

        /** @return the next smallest number */
        public int next() {
            return que.poll();
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !que.isEmpty();
        }
    }
}
