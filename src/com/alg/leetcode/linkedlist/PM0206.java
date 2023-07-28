package com.alg.leetcode.linkedlist;

public class PM0206 {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode slow = head,fast = head;
            while (fast!=null&&fast.next!=null) {
                fast=fast.next.next;
                slow =slow.next;
            }

            ListNode prev = null;
            while (slow!=null) {
                ListNode tmp = slow.next;
                slow.next = prev;
                prev = slow;
                slow = tmp;
            }

            while (head!=null&&prev!=null) {
                if(head.val==prev.val) {
                    head = head.next;
                    prev = prev.next;
                }
                else {
                    return false;
                }
            }
            return true;
        }
    }
}
