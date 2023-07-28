package com.alg.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class PM0201 {
    class Solution {
        public ListNode removeDuplicateNodes(ListNode head) {
            ListNode p = head;
            Set<Integer> set = new HashSet<>();
            while (p!=null) {
                set.add(p.val);
                ListNode q = p.next;
                ListNode pre = p;
                while (q!=null) {
                    if(set.contains(q.val)){
                        pre.next = q.next;
                    }
                    else {
                        pre = pre.next;
                    }
                    q = q.next;
                }
                p = p.next;
            }
            return head;
        }
    }
}
