package com.alg.dog.graph.leetcode207.bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/20 - 06 - 20 - 17:02
 * @Description: com.alg.dog.graph.leetcode207.bfs
 * @version: 1.0
 */
public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);
        int [] indegrees = new int[numCourses];
        for (int[] edge:prerequisites){
            int from = edge[1];
            int to = edge[0];
            indegrees[to]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        //先将所有的入度为0的节点加入到Queue
        for (int i = 0; i < numCourses; i++) {
            if(indegrees[i]==0){
                queue.offer(i);
            }
        }

        int count = 0;
        while (!queue.isEmpty()){
            int cur = queue.poll();
            count++;
            for(int next:graph[cur]){
                indegrees[next]--;
                if(indegrees[next]==0) {
                    queue.offer(next);
                }
            }
        }
        return count==numCourses;
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
