package com.alg.leetcode.sort;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P1030 {

    class Point {
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }

        public int distanceto(Point p0) {
            return Math.abs(r - p0.r) + Math.abs(c - p0.c);
        }

        @Override
        public String toString() {
            return "Point{" +
                    "r=" + r +
                    ", c=" + c +
                    '}';
        }
    }

    class Solution {

        public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {

            Point zero = new Point(r0,c0);

            PriorityQueue<Point> pq = new PriorityQueue<>(new Comparator<Point>() {
                @Override
                public int compare(Point o1, Point o2) {
                    int dis1 = o1.distanceto(zero);
                    int dis2 = o2.distanceto(zero);
                    return dis1 - dis2;
                }
            });

            for (int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++) {
                    Point p = new Point(r, c);
                    pq.offer(p);
                }
            }


            int[][] ans = new int[pq.size()][2];
            int i = 0;
            while (!pq.isEmpty()){
                Point p = pq.poll();
                ans[i][0] = p.r;
                ans[i][1] = p.c;
                i++;
                System.out.println(p.distanceto(zero));
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P1030().new Solution();
        int[][] res = solution.allCellsDistOrder(2, 2, 0, 1);
    }
}
