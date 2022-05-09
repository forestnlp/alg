package com.alg.dog.arraylist.twopointer.leetcode23;

import com.alg.dog.arraylist.twopointer.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        for (ListNode node : lists) {
            if(node!=null)
                pq.offer(node);
        }
        while (!pq.isEmpty()) {
            p.next = pq.poll();
            if (p.next != null && p.next.next != null) {
                pq.offer(p.next.next);
            }
            p = p.next;
        }
        return dummy.next;
    }
}