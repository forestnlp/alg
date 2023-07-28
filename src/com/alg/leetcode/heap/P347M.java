package com.alg.leetcode.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P347M {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int n : nums) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map.get(o2).compareTo(map.get(o1));
                }
            });

            for (int n : nums) {
                if(!pq.contains(n))
                    pq.offer(n);
            }

            int[] ans = new int[k];
            for (int i = 0; i < k; i++) {
                ans[i] = pq.poll();
            }
            return ans;
        }
    }
}
