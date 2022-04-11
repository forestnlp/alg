package com.alg.sword.jz18;

public class Solution {

    class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteNode (ListNode head, int val) {
        // write code here
        if(head.val==val)  return head.next;

        ListNode p = head;
        while (p.next!=null) {
            if(p.next.val==val){
                p.next = p.next.next;
            }
            p = p.next;
        }
        return head;
    }
}