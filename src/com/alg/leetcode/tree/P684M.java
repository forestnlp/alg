package com.alg.leetcode.tree;

import java.util.Arrays;

public class P684M {

    class UnionFind {
        int[] parents;
        int[] rank;

        public UnionFind(int total) {
            parents = new int[total];
            rank = new int[total];
            for (int i = 0; i < total; i++) {
                parents[i] = i;
                rank[i] = 1;
            }
        }

        public int find(int x) {
            if (x != parents[x])
                return find(parents[x]);
            else
                return x;
        }

        public void union(int p, int q) {
            int parentp = find(p);
            int parentq = find(q);
            if (parentp == parentq)
                return;
            if (rank[parentp] == rank[parentq]) {
                parents[parentq] = parentp;
                rank[parentp] +=1;
            } else if (rank[parentp] < rank[parentq]) {
                parents[parentp] = parentq;
            } else if (rank[parentp] > rank[parentq]) {
                parents[parentq] = parentp;
            }
        }
    }

    class Solution {
        public int[] findRedundantConnection(int[][] edges) {
            int[] res = new int[2];
            //正好N条边，代表N个顶点数
            UnionFind uf = new UnionFind(edges.length);
            for (int i = 0; i < edges.length; i++) {
                int p = edges[i][0]-1;
                int q = edges[i][1]-1;

                if (uf.find(p) != uf.find(q))
                    uf.union(p, q);
                else {
                    res[0] = p+1;
                    res[1] = q+1;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        P684M problem = new P684M();
        Solution solution = problem.new Solution();
        int[][] array = {{1,2},{2,3},{3,4},{1,4},{1,5}};
        int[] res = solution.findRedundantConnection(array);
        System.out.println(res[0]+","+res[1]);
    }
}
