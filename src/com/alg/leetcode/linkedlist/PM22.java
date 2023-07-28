package com.alg.leetcode.linkedlist;

public class PM22 {
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode slow = head,fast =head;

            for(int i=0;i<k;i++) {
                fast = fast.next;
            }

            while (fast!=null) {
                fast = fast.next;
                slow = slow.next;
            }

            return slow;
        }
    }
}
