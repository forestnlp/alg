package com.alg.leetcode.linkedlist;

public class P203 {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(-1);
            ListNode pre = dummy;
            dummy.next = head;
            ListNode curr = dummy.next;
            while (curr!=null) {
                if(curr.val==val) {
                    pre.next = curr.next;
                    curr = curr.next;
                }
                else {
                    pre = curr;
                    curr = curr.next;
                }
            }
            return dummy.next;
        }
    }
}
