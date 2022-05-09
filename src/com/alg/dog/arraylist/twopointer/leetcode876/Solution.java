package com.alg.dog.arraylist.twopointer.leetcode876;

import com.alg.dog.arraylist.twopointer.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}