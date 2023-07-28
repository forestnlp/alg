package com.alg.leetcode.graph;

import java.util.*;

public class PM0401M {
    class Solution {
        public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int[] path : graph) {
                if (map.containsKey(path[0])) {
                    map.get(path[0]).add(path[1]);
                } else {
                    List<Integer> tolist = new ArrayList<>();
                    tolist.add(path[1]);
                    map.put(path[0], tolist);
                }
            }
            Deque<Integer> deque = new LinkedList<>();
            deque.offerLast(start);
            while (!deque.isEmpty()) {
                int node = deque.poll();
                if (!map.containsKey(node)) continue;
                for (int to : map.get(node)) {
                    if (to == target) return true;
                    deque.offerLast(to);
                }
            }
            return false;
        }
    }
}
