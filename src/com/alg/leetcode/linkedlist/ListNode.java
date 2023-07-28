package com.alg.leetcode.linkedlist;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getInstace(int[] listvals) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        for(int i=0;i<listvals.length;i++)
        {
            curr.next = new ListNode(listvals[i]);
            curr = curr.next;
        }
        return head.next;
    }

    @Override
    public String toString() {
        if(this==null)  return "null";
        ListNode curr = this;
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (curr!=null) {
            sb.append(curr.val+"->");
            curr = curr.next;
            i++;
        }
        return sb.toString();
    }
}
