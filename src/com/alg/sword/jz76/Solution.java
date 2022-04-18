package com.alg.sword.jz76;

public class Solution {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = pHead;

        ListNode p = dummy;

        while (p.next!=null&&p.next.next!=null){
            if(p.next.val==p.next.next.val){
                int curval = p.next.val;
                while (p.next!=null&&p.next.val==curval){
                    p.next = p.next.next;
                }
            }else {
                p = p.next;
            }
        }
        return dummy.next;
    }

}