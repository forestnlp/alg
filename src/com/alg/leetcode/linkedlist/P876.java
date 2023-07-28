package com.alg.leetcode.linkedlist;

public class P876 {
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head,fast=head;
            while (fast!=null&&fast.next!=null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    }
}
