package com.alg.leetcode.heap;

import java.util.PriorityQueue;

public class PM40 {
    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int a : arr) {
                pq.offer(a);
            }
            int[] ans = new int[k];
            for(int i=0;i<k;i++) {
                ans[i] = pq.poll();
            }
            return ans;
        }
    }
}
