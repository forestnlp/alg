package com.alg.leetcode.array;

public class P1184 {
    class Solution {
        public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            int total = 0;
            for(int d:distance) {
                total+=d;
            }

            int dis1 = 0;
            int begin = Math.min(start,destination);
            int end = Math.max(start,destination);
            for(;begin<end;begin++) {
                dis1+=distance[begin];
            }

            int dis2=total-dis1;

            return Math.min(dis1,dis2);
        }
    }
}
