package com.alg.leetcode.linkedlist;

public class PM0207 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode pa = headA, pb = headB;
            while (pa!=pb) {
                if(pa==null) {
                    pa = headB;
                }
                else {
                    pa = pa.next;
                }
                if(pb==null){
                    pb = headA;
                }
                else {
                    pb = pb.next;
                }
            }
            return pb;
        }
    }
}
