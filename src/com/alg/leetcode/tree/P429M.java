package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P429M {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> nodes = new ArrayList<>();
            if(root==null) return nodes;
            Queue<Node> que = new LinkedList<>();
            que.offer(root);
            while(!que.isEmpty()) {
                int size = que.size();
                List<Integer> nodes_curlevel = new ArrayList<>();
                for(int i=0;i<size;i++) {
                    Node node = que.poll();
                    if (node != null) {
                        que.addAll(node.children);
                        nodes_curlevel.add(node.val);
                    }
                }
                nodes.add(nodes_curlevel);
            }
            return nodes;
        }
    }
}
