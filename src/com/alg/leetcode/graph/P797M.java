package com.alg.leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class P797M {
    class Solution {
        int n = 0;
        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            n = graph.length;
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            path.add(0);
            dfs(graph,ans,path,0);
            return ans;
        }

        public void dfs(int[][] graph,List<List<Integer>> ans,List<Integer> path,int node) {
            if(node == n-1) {
                ans.add(new ArrayList<>(path));
                return;
            }

            int [] availables = graph[node];

            for(int i=0;i<availables.length;i++) {
                path.add(availables[i]);
                dfs(graph,ans,path,availables[i]);
                path.remove(path.size()-1);
            }

        }
    }
}
