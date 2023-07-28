package com.alg.leetcode.graph;

public class P997 {
    class Solution {
        public int findJudge(int N, int[][] trust) {
            int[] out = new int[N + 1];
            int[] in = new int[N + 1];
            for (int[] trustEdge : trust) {
                out[trustEdge[0]]++;
                in[trustEdge[1]]++;
            }

            for (int i = 1; i <= N; i++) {
                if (out[i] == 0 && in[i] == N - 1) return i;
            }
            return -1;
        }
    }
}
