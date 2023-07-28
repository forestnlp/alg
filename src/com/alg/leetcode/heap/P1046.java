package com.alg.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P1046 {
    class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });

            for(int n:stones) {
                pq.offer(n);
            }

            while (pq.size()>=2) {
                int x = pq.poll();
                int y=pq.poll();
                int z = Math.abs(x-y);
                if(z>0) {
                    pq.offer(z);
                }
            }

            return pq.isEmpty()?0:pq.peek();
        }
    }
}
