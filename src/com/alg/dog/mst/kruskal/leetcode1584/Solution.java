package com.alg.dog.mst.kruskal.leetcode1584;

import com.alg.dog.unionfind.UF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int xi = points[i][0], yi = points[i][1];
            for (int j = i + 1; j < n; j++) {
                int xj = points[j][0], yj = points[j][1];
                int distance = Math.abs(xj - xi) + Math.abs(yj - yi);
                edges.add(new int[]{i, j, distance});
            }
        }

        Collections.sort(edges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2]-o2[2];
            }
        });

        int mst = 0;
        UF uf = new UF(n);
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            int distance = edge[2];
            if(uf.connected(u,v)){
                continue;
            } else {
                mst+=distance;
                uf.union(u,v);
            }
        }
        return mst;
    }
}