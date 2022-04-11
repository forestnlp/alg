package com.alg.sword.jz06;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Solution2 {

    static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Deque<Integer> stack = new ArrayDeque<>();
        while (listNode!=null) {
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        return new ArrayList<>(stack);
    }
}