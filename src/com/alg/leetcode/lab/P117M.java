package com.alg.leetcode.lab;


public class P117M {

    class Solution {
        public Node connect(Node root) {

            if (root == null) return null;

            Node left = root.left;
            Node right = root.right;

            if (left != null && right != null)
                left.next = right;

            Node bro = root.next;

            while (bro != null) {

                Node next = bro.left == null ? bro.right : bro.left;

                if (right.next == null&&right != null) {
                        right.next = next;
                }

                if (left.next == null&&left != null) {
                        left.next = next;
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

    public static void main(String[] args) {
        Integer[] array = {2,1,3,0,7,9,1,2,null,1,0,null,null,8,8,null,null,null,null,7};
        Node node = Node.getInstance(array);
        P117M problem = new P117M();
        Solution solution = problem.new Solution();
        Node res = solution.connect(node);
    }
}
