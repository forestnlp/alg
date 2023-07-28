package com.alg.leetcode.math;

public class P812 {
    class Solution {
        public double largestTriangleArea(int[][] points) {
            double ans = 0;
            for(int i=0;i<points.length;i++) {
                for(int k=i+1;k<points.length;k++) {
                    for(int j=k+1;j<points.length;j++) {
                        ans = Math.max(ans,area(points[i],points[k],points[j]));
                    }
                }
            }
            return ans;
        }

        public double area(int[] p1,int[] p2,int[] p3) {
            return 0.5*(Math.abs(p1[0]*p2[1]+p2[0]*p3[1]+p3[0]*p1[1]-p1[0]*p3[1]-p2[0]*p1[1]-p3[0]*p2[1]));
        }
    }
}
