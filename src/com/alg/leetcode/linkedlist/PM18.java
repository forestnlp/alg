package com.alg.leetcode.linkedlist;

public class PM18 {
    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode prev = dummy;
            ListNode curr = head;
            while (curr!=null) {
                if(curr.val==val) {
                    prev.next = curr.next;
                    curr = curr.next;
                }
                else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            return dummy.next;
        }
    }
}
