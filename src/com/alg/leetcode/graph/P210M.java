package com.alg.leetcode.graph;

import java.lang.reflect.Array;
import java.util.*;

public class P210M {

    class Solution {

        public int[] findOrder(int numCourses, int[][] prerequisites) {

            List<List<Integer>> graph = new ArrayList<>();
            int [] indegree = new int[numCourses];

            for(int i=0;i<numCourses;i++) {
                graph.add(new ArrayList<>());
            }

            for(int[] edge:prerequisites){
                int from = edge[1];
                int to = edge[0];
                graph.get(from).add(to);
                indegree[to]++;
            }

            Queue<Integer> queue = new LinkedList<>();

            int[] orders = new int[numCourses];
            int num = 0;

            for(int i=0;i<indegree.length;i++) {
                if(indegree[i]==0)
                    queue.offer(i);
            }

            while (!queue.isEmpty()) {
                int node = queue.poll();
                orders[num] = node;
                num++;

                List<Integer> tos = graph.get(node);
                for(int i:tos) {
                    indegree[i]--;
                    if(indegree[i]==0)
                        queue.offer(i);
                }
            }

            if(num!=numCourses) return new int[0];
            return orders;
        }
    }
}
