package com.alg.sword.jz35;


import java.util.HashMap;
import java.util.Map;

public class Solution {

    static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;

        RandomListNode original = pHead;
        //复制，形成AA'->BB'->CC'的形式
        while (original != null) {
            RandomListNode copy = new RandomListNode(original.label);
            copy.next = original.next;
            original.next = copy;
            original = copy.next;
        }
        //利用结构，复制random
        original = pHead;
        RandomListNode newP = pHead.next;
        while (original != null ) {
            newP.random = original.random==null?null:original.random.next;
            original = original.next==null?null:original.next.next;
            newP = newP.next==null?null:newP.next.next;
        }
        //解离
        RandomListNode head = pHead.next;
        original = pHead;
        newP = pHead.next;
        while (original != null ) {
            original.next = original.next==null?null:original.next.next;
            newP.next = newP.next==null?null:newP.next.next;
            original = original.next;
            newP = newP.next;
        }
        return head;
    }

    public static void main(String[] args) {
        RandomListNode l1 = new RandomListNode(1);
        RandomListNode l2 = new RandomListNode(2);
        RandomListNode l3 = new RandomListNode(3);
        RandomListNode l4 = new RandomListNode(4);
        RandomListNode l5 = new RandomListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l1.random = l3;
        l2.random = l5;
        l4.random = l2;
        RandomListNode clone = new Solution().Clone(l1);
        while (clone != null) {
            System.out.println(clone.label + ", val = " + clone + ", random = " + clone.random+ ", next = " + clone.next);
            clone = clone.next;
        }
        System.out.println("___________________________");
        while (l1 != null) {
            System.out.println(l1.label + ", val = " + l1 + ",random = " + l1.random+ ", next = " + l1.next);
            l1 = l1.next;
        }
    }
}