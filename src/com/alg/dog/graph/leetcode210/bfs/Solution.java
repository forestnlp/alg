package com.alg.dog.graph.leetcode210.bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/20 - 06 - 20 - 17:02
 * @Description: com.alg.dog.graph.leetcode210.bfs
 * @version: 1.0
 */
public class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);
        int[] inDegrees = new int[numCourses];
        for (int[] edge : prerequisites) {
            int from = edge[1];
            int to = edge[0];
            inDegrees[to]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(inDegrees[i]==0)
                queue.offer(i);
        }

        int[] res = new int[numCourses];
        int count = 0;
        while (!queue.isEmpty()){
            int cur = queue.poll();
            res[count] = cur;
            count++;
            for(int next:graph[cur]){
                inDegrees[next]--;
                if(inDegrees[next]==0)
                    queue.offer(next);
            }
        }

        if(count!=numCourses){
            return new int[]{};
        }

        return res;
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
