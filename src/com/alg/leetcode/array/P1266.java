package com.alg.leetcode.array;

public class P1266 {
    class Solution {
        public int minTimeToVisitAllPoints(int[][] points) {
            int startX = points[0][0];
            int startY = points[0][1];
            int ans = 0;
            for(int i=1;i<points.length;i++) {
                ans+=Math.max(Math.abs(points[i][0]-startX),Math.abs(points[i][1]-startY));
                //move
                startX = points[i][0];
                startY = points[i][1];
            }
            return ans;
        }
    }
}
