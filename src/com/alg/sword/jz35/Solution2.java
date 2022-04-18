package com.alg.sword.jz35;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Solution2 {

    static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode dummy = new RandomListNode(-1);
        RandomListNode newp = dummy;
        RandomListNode p = pHead;
        while (p!=null){
            RandomListNode node = new RandomListNode(p.label);
            newp.next = node;
            newp = newp.next;
            map.put(p,newp);
            p = p.next;
        }
        for(Map.Entry<RandomListNode,RandomListNode> entry:map.entrySet()){
            if(entry.getKey().random==null) continue;
            entry.getValue().random = map.get(entry.getKey().random);
        }
        return dummy.next;
    }
}