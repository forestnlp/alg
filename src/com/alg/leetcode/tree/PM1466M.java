package com.alg.leetcode.tree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PM1466M {
    class Solution {
        public int minReorder(int n, int[][] connections) {
            int revert = 0;
            Set<Integer> validNodes = new HashSet<>();
            validNodes.add(0);
            while (validNodes.size() != n) {
                for (int[] edge : connections) {
                    int from = edge[0];
                    int to = edge[1];

                    if (validNodes.contains(to))
                        validNodes.add(from);
                    else if (validNodes.contains(from)){
                        validNodes.add(to);
                        revert++;
                    }
                }
            }
            return revert;
        }
    }

    public static void main(String[] args) {
        PM1466M plan = new PM1466M();
        Solution solution = plan.new Solution();
        int[][] connections = {{0, 1}, {2, 1}, {3, 2}, {0, 4}, {5, 1}, {2, 6}, {5, 7}, {3, 8}, {8, 9}};
        Arrays.sort(connections);
        int res = solution.minReorder(10, connections);
        System.out.println(res);
    }
}
