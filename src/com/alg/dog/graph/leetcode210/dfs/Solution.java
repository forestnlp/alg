package com.alg.dog.graph.leetcode210.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/20 - 06 - 20 - 16:52
 * @Description: com.alg.dog.graph.leetcode210
 * @version: 1.0
 */
public class Solution {

    List<Integer> postOrder = new ArrayList<>();
    boolean hasCycle = false;
    boolean[] visited, onPath;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);
        visited = new boolean[numCourses];
        onPath = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            traverse(graph, i);
        }
        if (hasCycle) {
            return new int[]{};
        }
        Collections.reverse(postOrder);
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = postOrder.get(i);
        }
        return res;
    }

    private void traverse(List<Integer>[] graph, int s) {
        if (onPath[s]) hasCycle = true;
        if (visited[s] || hasCycle) return;
        onPath[s] = true;
        visited[s] = true;
        for (int t:graph[s]) {
            traverse(graph,t);
        }
        postOrder.add(s);
        onPath[s] = false;
    }

    private List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new LinkedList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new LinkedList<>();
        }
        for (int[] edge : prerequisites) {
            int from = edge[1];
            int to = edge[0];
            graph[from].add(to);
        }
        return graph;
    }
}
