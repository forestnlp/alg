package com.alg.leetcode.linkedlist;

public class PM0203 {
    class Solution {
        public void deleteNode(ListNode node) {
            ListNode next = node.next;
            node.val = next.val;
            node.next = next.next;
        }
    }
}
