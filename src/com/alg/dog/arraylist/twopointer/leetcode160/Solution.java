package com.alg.dog.arraylist.twopointer.leetcode160;

import com.alg.dog.arraylist.twopointer.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        while (pA!=pB) {

            if (pA != null) pA = pA.next;
            else pA = headB;

            if (pB != null) pB = pB.next;
            else pB = headA;
        }
        return pA;
    }
}