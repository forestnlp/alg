package com.alg.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class P1029 {
    class Solution {
        public int twoCitySchedCost(int[][] costs) {
            Arrays.sort(costs, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    int cost1 = o1[0] - o1[1];
                    int cost2 = o2[0] - o2[1];
                    return cost1 - cost2;
                }
            });

            int num = 0;
            for (int i = 0; i < costs.length; i++) {
                if (i <= (costs.length-1) / 2)
                    num += costs[i][0];
                else
                    num += costs[i][1];
            }
            return num;
        }
    }
}
