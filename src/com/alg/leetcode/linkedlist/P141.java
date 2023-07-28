package com.alg.leetcode.linkedlist;

public class P141 {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow=head,fast=head;

            while (fast.next!=null&&fast!=null) {
                fast=fast.next.next;
                slow = slow.next;
                if(slow==fast) return true;
            }
            return false;
        }
    }
}
