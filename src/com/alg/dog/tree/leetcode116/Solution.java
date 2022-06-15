package com.alg.dog.tree.leetcode116;

import com.alg.dog.tree.Node;

public class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        helper(root.left, root.right);
        return root;
    }

    public void helper(Node node1, Node node2) {
        if (node1 == null || node2 == null)
            return;
        node1.next = node2;
        helper(node1.left, node1.right);
        helper(node1.right, node2.left);
        helper(node2.left, node2.right);
    }
}