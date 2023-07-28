package com.alg.leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P207M {
    class Solution{
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            List<List<Integer>> graph = new ArrayList<>();
            int[] indegree = new int[numCourses];

            for (int i = 0; i < numCourses; i++) {
                graph.add(new ArrayList<>());
            }

            for (int[] edge : prerequisites) {
                graph.get(edge[1]).add(edge[0]);
                indegree[edge[0]]++;
            }

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < numCourses; i++) {
                if (indegree[i] == 0) queue.offer(i);
            }

            int visited = 0;

            while (!queue.isEmpty()) {
                int node = queue.poll();

                for (int next : graph.get(node)) {
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        queue.offer(next);
                    }
                }
                visited++;
            }

            return visited == numCourses;
        }
    }

}
