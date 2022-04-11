package com.alg.sword.jz24;

public class Solution {
    static class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode next = head.next;
        head.next = null;
        return helper(head,next);
    }

    public ListNode helper(ListNode left,ListNode right) {
        if(right.next==null){
            right.next = left;
            return right;
        }
        ListNode next = right.next;
        right.next = left;
        return helper(right,next);
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(5);
        ListNode node3= new ListNode(2);
        node1.next = node2;
        node2.next = node3;

        ListNode node = new Solution().ReverseList(node1);
        while (node!=null) {
            System.out.print(node.val+"\t");
            node = node.next;
        }
    }
}