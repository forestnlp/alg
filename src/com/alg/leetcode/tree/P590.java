package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P590 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    class Solution {
        List<Integer> ls_travel = new ArrayList<>();
        public List<Integer> postorder(Node root) {
            helper(root);
            return ls_travel;
        }

        public void helper(Node node) {
            if(node==null) return;

            for(Node child:node.children) {
                helper(child);
            }
            ls_travel.add(node.val);
        }
    }
}
