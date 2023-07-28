package com.alg.leetcode.map;

public class P463 {
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int totallen = 0;
            for (int i = 0; i < m; i++) {
                for (int k = 0; k < n; k++) {
                    int g = grid[i][k];
                    if (g == 1) {
                        totallen += 4;
                        //left
                        if (k > 0 && grid[i][k - 1] == 1) totallen--;
                        //right
                        if (k < n - 1 && grid[i][k + 1] == 1) totallen--;
                        //up
                        if (i > 0 && grid[i - 1][k] == 1) totallen--;
                        //down
                        if (i < m - 1 && grid[i + 1][k] == 1) totallen--;
                    }
                }
            }
            return totallen;
        }
    }
}
