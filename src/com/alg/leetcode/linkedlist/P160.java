package com.alg.leetcode.linkedlist;

public class P160 {
    class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;
            ListNode pA = headA, pB = headB;
            while (pA != pB) {
                pA = (pA == null) ? headB : pA.next;
                pB = (pB == null) ? headA : pB.next;
            }
            return pA;
        }
    }

    public static void main(String[] args) {
        ListNode nodeA = ListNode.getInstace(new int[]{4, 1, 8, 4, 5});
        ListNode nodeB = ListNode.getInstace(new int[]{5, 6, 1, 8, 4, 5});
        Solution solution = new P160().new Solution();
        ListNode ret = solution.getIntersectionNode(nodeA, nodeB);
        System.out.println(ret);
    }
}
