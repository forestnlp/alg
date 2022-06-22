package com.alg.dog.dijkstra.leetcode743;

import java.util.*;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] graph = new LinkedList[n+1];
        for (int i = 0; i <=n; i++) {
            graph[i] = new LinkedList<>();
        }

        for(int[] edge:times){
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            graph[from].add(new int[]{to,weight});
        }

        int[] distTo = dijkstra(k,graph);

        int res = 0;
        for (int i = 1; i < distTo.length; i++) {
            if(distTo[i]==Integer.MAX_VALUE) return -1;
            res = Math.max(res,distTo[i]);
        }
        return res;
    }

    class State{
        int id;
        int distFromStart;
        public State(int id, int distFromStart) {
            this.id = id;
            this.distFromStart = distFromStart;
        }
    }

    int[] dijkstra(int start,List<int[]>[] graph){
        int[] distTo = new int[graph.length];

        Arrays.fill(distTo,Integer.MAX_VALUE);
        distTo[start] = 0;

        PriorityQueue<State> pq = new PriorityQueue<>(new Comparator<State>() {
            @Override
            public int compare(State o1, State o2) {
                return o1.distFromStart-o2.distFromStart;
            }
        });
        pq.offer(new State(start,0));
        while (!pq.isEmpty()){
            State curNode = pq.poll();
            int curNodeId = curNode.id;
            int distanceFromStrart = curNode.distFromStart;

            if(distanceFromStrart>distTo[curNodeId]){
                continue;
            }
            for (int[] neighbor:graph[curNodeId]){
                int nextNodeId = neighbor[0];
                int distToNextNode = distTo[curNodeId]+neighbor[1];
                if(distTo[nextNodeId]>distToNextNode){
                    distTo[nextNodeId] = distToNextNode;
                    pq.offer(new State(nextNodeId,distToNextNode));
                }
            }
        }
        return distTo;
    }
}