package com.alg.sword.jz25;

public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (list1!=null&&list2!=null){
            if(list1.val< list2.val){
                head.next = list1;
                list1 = list1.next;
            }
            else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        ListNode l = list1==null?list2:list1;
        head.next = l;
        return dummy.next;
    }
}