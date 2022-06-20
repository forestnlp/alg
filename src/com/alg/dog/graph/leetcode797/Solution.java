package com.alg.dog.graph.leetcode797;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> path = new LinkedList<>();
        traverse(graph, 0, path);
        return ans;
    }

    public void traverse(int[][] graph, int s, LinkedList<Integer> path) {
        path.addLast(s);

        int n = graph.length;
        if (s == n - 1) {
            ans.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }

        for (int v : graph[s]) {
            traverse(graph, v, path);
        }

        path.removeLast();
    }
}