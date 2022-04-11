package com.alg.sword.jz06;


import java.util.ArrayList;

public class Solution {

    static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        while (listNode!=null) {
            ret.add(0,listNode.val);
            listNode=listNode.next;
        }
        return ret;
    }
}