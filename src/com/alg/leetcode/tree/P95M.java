package com.alg.leetcode.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * k把问题分为1-(k-1),k,(k+1)-n
 * 递归解决，最好用动态规划。暂时不考虑
 */
public class P95M {
    class Solution {

        public List<TreeNode> generateTrees(int n) {
            if (n == 0) return new ArrayList<TreeNode>();
            List<TreeNode> nodes = helper(1, n);
            return nodes;
        }

        public List<TreeNode> helper(int s, int e) {

            List<TreeNode> trees = new ArrayList<>();
            if (s > e) {
                trees.add(null);
            }

            for (int i = s; i <= e; i++) {
                List<TreeNode> leftTrees = helper(s, i - 1);
                List<TreeNode> rightTrees = helper(i + 1, e);

                for (TreeNode left : leftTrees) {
                    for (TreeNode right : rightTrees) {
                        TreeNode root = new TreeNode(i);
                        root.left = left;
                        root.right = right;
                        trees.add(root);
                    }
                }
            }

            return trees;
        }
    }
}
