package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P655M {

    class Solution {
        List<List<String>> ans;
        int depth, size;

        public List<List<String>> printTree(TreeNode root) {
            ans = new ArrayList<>();
            depth = depth(root);
            size = (int) Math.pow(2, depth) - 1;

            List<String> curlist = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                curlist.add("");
            }

            for (int i = 0; i < depth; i++) {
                ans.add(new ArrayList<>(curlist));
            }

            helper(root, 0, size - 1, 0);
            return ans;
        }

        public int depth(TreeNode root) {
            if (root == null) return 0;
            return 1 + Math.max(depth(root.left), depth((root.right)));
        }


        //每一代都为下一代搭建平台
        public void helper(TreeNode node, int start, int end, int d) {
            if(d>depth) return;
            int mid = start + (end - start) / 2;
            ans.get(d).set(mid, String.valueOf(node.val));
            if (node.left != null) helper(node.left, start, mid - 1,d+1);
            if (node.right != null) helper(node.right, mid + 1, end,d+1);
        }
    }
}
