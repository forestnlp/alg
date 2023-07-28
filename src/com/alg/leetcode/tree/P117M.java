package com.alg.leetcode.tree;

public class P117M {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    class Solution {
        public Node connect(Node root) {

            if (root == null) return null;

            Node left = root.left;
            Node right = root.right;

            if(left!=null&&right!=null)
                left.next = right;

            Node bro = root.next;

            while(bro!=null) {

                Node next = bro.left==null?bro.right:bro.left;

                if(right!=null) {
                    if(right.next==null) {
                        right.next = next;
                    }
                }

                if(left!=null) {
                    if(left.next==null) {
                            left.next = next;
                    }
                }

                bro = bro.next;
            }
            //很重要。但我没有完全搞懂啊。
            //感觉应该顺序可以反过来。但是就只能先右边再左边
            connect(right);
            connect(left);
            return root;
        }
    }
}
