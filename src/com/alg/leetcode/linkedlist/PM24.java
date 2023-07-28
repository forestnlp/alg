package com.alg.leetcode.linkedlist;

public class PM24 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre=null,cur=head;
            while (cur!=null) {
                ListNode tmp = cur.next;
                cur.next = pre;
                pre =cur;
                cur = tmp;
            }
            return pre;
        }
    }
}
