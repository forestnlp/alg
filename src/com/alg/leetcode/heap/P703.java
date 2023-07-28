package com.alg.leetcode.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P703 {
    class KthLargest {
        PriorityQueue<Integer> pq;
        int pqSize;

        public KthLargest(int k, int[] nums) {
            pqSize = k;
            pq = new PriorityQueue<>();
            for (int n : nums) {
                add(n);
            }
        }

        public int add(int val) {
            if (pq.size() < pqSize) {
                pq.offer(val);
            } else {
                if (val > pq.peek()) {
                    pq.poll();
                    pq.offer(val);
                }
            }
            return pq.peek();
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(Arrays.asList(2, 4, 6, 8, 1, 3, 5, 7, 9));
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
