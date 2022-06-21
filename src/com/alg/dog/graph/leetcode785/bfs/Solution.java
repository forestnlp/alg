package com.alg.dog.graph.leetcode785.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private boolean isBiparties = true;

    private boolean[] color;

    private boolean[] visited;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        color = new boolean[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(graph, i);
            }
        }
        return isBiparties;
    }

    private void bfs(int[][] graph, int i) {
        if (!isBiparties) return;
        Queue<Integer> queue = new LinkedList<>();
        visited[i] = true;
        queue.offer(i);
        while (!queue.isEmpty() && isBiparties) {
            int v = queue.poll();
            for (int w : graph[v]) {
                if (!visited[w]) {
                    color[w] = !color[v];
                    visited[w] = true;
                    queue.offer(w);
                } else {
                    if (color[w] == color[v]) {
                        isBiparties = false;
                    }
                }
            }
        }
    }
}
