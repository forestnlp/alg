package com.alg.dog.graph.leetcode207.dfs;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/20 - 06 - 20 - 16:31
 * @Description: com.alg.dog.graph.leetcode207
 * @version: 1.0
 */
public class Solution {

    boolean[] onPath;
    boolean[] visited;
    boolean hasCycle = false;

    //判断是否有环
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);
        visited = new boolean[numCourses];
        onPath = new boolean[numCourses];
        for (int i=0;i<numCourses;i++){
            traverse(graph,i);
        }
        return !hasCycle;
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

    private void traverse(List<Integer>[] graph, int s) {
        if (onPath[s]) {
            hasCycle = true;
        }
        if (visited[s] || hasCycle) {
            return;
        }
        visited[s] = true;
        onPath[s] = true;

        for (int t : graph[s]) {
            traverse(graph, t);
        }
        onPath[s] = false;
    }


}
