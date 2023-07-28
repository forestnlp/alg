package com.alg.leetcode.tree;

import java.util.*;

public class P971M {

    class Solution {

        List<Integer> flipActions;

        boolean Matched = true;

        public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {

            Queue<Integer> paths = new LinkedList<>();

            for (int v : voyage) {
                paths.offer(v);
            }

            flipActions = new ArrayList<>();

            dfs(root, paths);

            return Matched?flipActions:Arrays.asList(-1);
        }

        public void dfs(TreeNode node, Queue<Integer> paths) {

            if (node == null) return;

            if (paths.isEmpty()) return;

            if (node.val != paths.peek()) {
                Matched = false;
            }
            else {
                paths.poll();
                if(node.left!=null&&node.left.val!=paths.peek()) {
                    TreeNode temp = node.left;
                    node.left = node.right;
                    node.right = temp;
                    flipActions.add(node.val);
                }
                dfs(node.left,paths);
                dfs(node.right,paths);
            }
        }
    }
}
