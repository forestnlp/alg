package com.alg.dog.graph.leetcode886;

import java.util.LinkedList;
import java.util.List;

class Solution {

    private boolean isBiparties = true;
    private boolean[] color;
    private boolean[] visited;

    public boolean possibleBipartition(int n, int[][] dislikes) {
        color = new boolean[n+1];
        visited = new boolean[n+1];
        List<Integer>[] graph = buildGraph(n,dislikes);
        for(int v=1;v<=n;v++){
            if(!visited[v]){
                traverse(graph,v);
            }
        }
        return isBiparties;
    }

    private void traverse(List<Integer>[] graph, int v) {
        if(!isBiparties) return;
        visited[v] = true;
        for(int w:graph[v]){
            if(!visited[w]){
                color[w] = !color[v];
                traverse(graph,w);
            }
            else {
                if(color[w]==color[v]){
                    isBiparties=false;
                }
            }
        }
    }

    private List<Integer>[] buildGraph(int n, int[][] dislikes) {
        List<Integer>[] graph = new LinkedList[n+1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new LinkedList<>();
        }
        for(int[] edge:dislikes){
            int v = edge[1] ;
            int w = edge[0];
            graph[v].add(w);
            graph[w].add(v);
        }
        return graph;
    }
}