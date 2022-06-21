package com.alg.dog.graph.leetcode785.dfs;

public class Solution {

    private boolean isBiParties = true;

    private boolean[] color;

    private boolean[] visited;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        color = new boolean[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                traverse(graph, i);
            }
        }
        return isBiParties;
    }

    private void traverse(int[][] graph, int i) {
        visited[i] = true;

        for (int w : graph[i]) {
            if (!visited[w]) {
                color[w] = !color[i];
                traverse(graph, w);
            } else {
                if (color[w] == color[i]) {
                    isBiParties = false;
                    return;
                }
            }
        }
    }
}