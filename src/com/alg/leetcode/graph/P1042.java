package com.alg.leetcode.graph;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P1042 {
    class Solution {
        public int[] gardenNoAdj(int n, int[][] paths) {

            Map<Integer, Set<Integer>> graph = new HashMap<>();

            for(int i=1;i<=n;i++) {
                graph.put(i,new HashSet<>());
            }

            for(int [] path:paths) {
                int from = path[0];
                int to = path[1];
                graph.get(from).add(to);
                graph.get(to).add(from);
            }

            int[] ans = new int[n];

            for(int i=1;i<=n;i++){
                boolean [] color = new boolean[5];
                for(int adj:graph.get(i)) {
                    color[ans[adj-1]] = true;
                }
                for(int k=1;k<=4;k++) {
                    if(!color[k]){
                        ans[i-1]=k;
                        break;
                    }
                }
            }
            return ans;
        }
    }
}
