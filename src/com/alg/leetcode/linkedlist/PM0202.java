package com.alg.leetcode.linkedlist;

public class PM0202 {
    class Solution {
        public int kthToLast(ListNode head, int k) {
            ListNode fast=head,slow=head;
            while (k>0) {
                fast = fast.next;
                k--;
            }
            while (fast!=null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow.val;
        }
    }
}
