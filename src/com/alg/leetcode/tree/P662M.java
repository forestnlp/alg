package com.alg.leetcode.tree;

import java.util.*;

public class P662M {

    class SNode {
        TreeNode node;
        int depth;
        int num;

        public SNode(TreeNode node, int depth, int num) {
            this.node = node;
            this.depth = depth;
            this.num = num;
        }
    }

    class Solution {
        public int widthOfBinaryTree(TreeNode root) {
            int maxwidth = 0;
            Deque<SNode> deque = new LinkedList<>();
            deque.offer(new SNode(root,1,1));

            while (!deque.isEmpty()) {

                int size = deque.size();
                SNode start = deque.peekFirst();
                SNode end = deque.peekLast();

                if(end.num-start.num+1>maxwidth)
                    maxwidth = end.num-start.num+1;

                for (int i = 0; i < size; i++) {
                    SNode node = deque.poll();
                    if(node.node.left!=null) deque.offer(new SNode(node.node.left,node.depth+1,node.num*2));
                    if(node.node.right!=null) deque.offer(new SNode(node.node.right,node.depth+1,node.num*2+1));
                }
            }
            return maxwidth;
        }
    }
}
