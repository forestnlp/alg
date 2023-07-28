package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class P447 {
    class Solution {
        public int numberOfBoomerangs(int[][] points) {
            int ans = 0;
            for (int i = 0; i < points.length; i++) {
                int[] p = points[i];
                Map<Integer, Integer> map = new HashMap<>();
                for (int j = 0; j < points.length; j++) {
                    if (j != i) {
                        int[] q = points[j];
                        int dis = distance(p, q);
                        map.put(dis, map.getOrDefault(dis, 0) + 1);
                    }
                }
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    ans += entry.getValue() * (entry.getValue() - 1);
                }
            }
            return ans;
        }

        private int distance(int[] p, int[] q) {
            return (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
        }
    }
}
