package com.alg.sword.jz24;

public class Solution2 {
    static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode next= head.next;
        ListNode pre = head;
        pre.next = null;

        while (next!=null) {
            ListNode tmp = next.next;
            next.next = pre;
            pre = next;
            next = tmp;
        }
        return pre;
    }
}