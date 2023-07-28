package com.alg.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PM1714 {
    class Solution {
        public int[] smallestK(int[] arr, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });

            if(k==0) return new int[0];

            for(int a:arr) {
                if(pq.size()<k) pq.offer(a);

                else if(pq.peek()>a){
                    pq.poll();
                    pq.offer(a);
                }
            }

            int[] ans = new int[k];
            for(int i=0;i<k;i++) {
                ans[i] = pq.poll();
            }
            return ans;
        }
    }
}
