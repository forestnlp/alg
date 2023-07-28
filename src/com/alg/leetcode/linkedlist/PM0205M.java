package com.alg.leetcode.linkedlist;

public class PM0205M {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode res = new ListNode(-1);
            ListNode dummy = res;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int a = l1 == null ? 0 : l1.val;
                int b = l2 == null ? 0 : l2.val;
                int c = (a + b + carry) % 10;
                carry = (a + b + carry) / 10;
                res.next = new ListNode(c);
                res = res.next;
                l1 = l1 == null ? null : l1.next;
                l2 = l2 == null ? null : l2.next;
            }

            if (l1 == null) res.next = l2;
            if (l2 == null) res.next = l1;
            if (carry != 0) res.next = new ListNode(carry);
            return dummy.next;
        }
    }
}
