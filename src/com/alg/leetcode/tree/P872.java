package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P872 {
    class Solution {

        List<Integer> tree1=new ArrayList<>();
        List<Integer> tree2=new ArrayList<>();

        public boolean leafSimilar(TreeNode root1, TreeNode root2) {

            preOrder(root1, tree1);
            preOrder(root2, tree2);

            if (tree1.equals(tree2)) return true;
            return false;
        }

        public void preOrder(TreeNode node, List<Integer> list) {
            if(node==null) return;
            if (node != null && node.left == null && node.right == null)
                list.add(node.val);
            preOrder(node.left, list);
            preOrder(node.right, list);
        }
    }
}
