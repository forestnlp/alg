package com.alg.sword.jz23;


public class Solution {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;
        ListNode p = pHead;
        if(pHead==null||pHead.next==null) return null;
        while (fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
                break;
        }
        if(fast==null||fast.next==null) return null;
        while (p!=slow){
            p = p.next;
            slow = slow.next;
        }
        return p;
    }
}