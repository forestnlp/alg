package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P987M {

    class Solution {

        List<Node2D> node2Ds = new ArrayList<>();

        public List<List<Integer>> verticalTraversal(TreeNode root) {

            List<List<Integer>> res = new ArrayList<>();

            preOrder(root, 0, 0);

            Collections.sort(node2Ds);

            Node2D pre = node2Ds.get(0);

            res.add(new ArrayList<Integer>());

            for (Node2D node : node2Ds) {

                if (node.x != pre.x)
                    res.add(new ArrayList<Integer>());

                res.get(res.size() - 1).add(node.val);

                pre = node;
            }

            return res;
        }

        public void preOrder(TreeNode node, int x, int y) {
            if (node == null) return;
            node2Ds.add(new Node2D(x, y, node.val));
            preOrder(node.left, x - 1, y + 1);
            preOrder(node.right, x + 1, y + 1);
        }
    }

    class Node2D implements Comparable<Node2D> {
        int x;
        int y;
        int val;

        public Node2D(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Node2D o) {
            if (this.x != o.x) return Integer.compare(this.x, o.x);
            else if (this.y != o.y) return Integer.compare(this.y, o.y);
            else return Integer.compare(this.val, o.val);
        }

        @Override
        public String toString() {
            return "Node2D{" +
                    "x=" + x +
                    ", y=" + y +
                    ", val=" + val +
                    '}';
        }
    }
}
