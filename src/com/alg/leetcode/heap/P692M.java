package com.alg.leetcode.heap;

import java.util.*;

public class P692M {
    class Solution {
        public List<String> topKFrequent(String[] words, int k) {
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int c1 = map.getOrDefault(o1, 0);
                    int c2 = map.getOrDefault(o2, 0);
                    if (c1 == c2)
                        return o1.compareTo(o2);
                    else
                        return c2 - c1;
                }
            });

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                pq.offer(entry.getKey());
            }

            List<String> ans = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                ans.add(pq.poll());
            }
            return ans;
        }
    }
}
