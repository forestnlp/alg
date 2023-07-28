package com.alg.leetcode.tree;

import java.util.*;

public class PM0403M {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode[] listOfDepth(TreeNode tree) {
            List<ListNode> list = new ArrayList<>();
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(tree);
            while(!que.isEmpty()) {
                int size = que.size();
                ListNode dummy = new ListNode(-1);
                ListNode curr=null;
                for(int i=0;i<size;i++) {
                    TreeNode node = que.poll();
                    if(i==0) {
                        dummy.next = new ListNode(node.val);
                        curr = dummy.next;
                    }
                    else {
                        curr.next = new ListNode(node.val);
                        curr = curr.next;
                    }
                    if(node.left!=null) que.offer(node.left);
                    if(node.right!=null) que.offer(node.right);
                }
                list.add(dummy.next);
            }
            ListNode[] res = new ListNode[list.size()];
            for(int i=0;i<list.size();i++) {
                res[i] = list.get(i);
            }
            return res;
        }
    }

}
