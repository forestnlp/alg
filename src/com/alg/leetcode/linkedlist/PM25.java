package com.alg.leetcode.linkedlist;

public class PM25 {
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1==null) return l2;
            if(l2==null) return l1;

            ListNode list = new ListNode(-1);
            ListNode dummy = list;

            while (l1!=null&&l2!=null) {
                if(l1.val>l2.val) {
                    list.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
                else {
                    list.next = new ListNode(l1.val);
                    l1 = l1.next;
                }
                list = list.next;
            }

            if(l1==null) list.next = l2;
            if(l2==null) list.next = l1;

            return dummy.next;
        }
    }
}
