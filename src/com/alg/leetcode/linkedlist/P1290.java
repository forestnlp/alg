package com.alg.leetcode.linkedlist;

public class P1290 {
    class Solution {
        public int getDecimalValue(ListNode head) {
            int dec = 0;
            while (head != null) {
                dec = dec << 1;
                dec += head.val;
                head = head.next;
            }
            return dec;
        }
    }
}
