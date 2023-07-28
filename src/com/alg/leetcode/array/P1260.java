package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class P1260 {
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int m = grid.length;
            int n = grid[0].length;
            int shift = k % (m * n);

            int[] shiftGrid1d = new int[m * n];
            for (int r = 0; r < m; r++) {
                for (int c = 0; c < n; c++) {
                    int idx = (r * n + c + shift) % (m * n);
                    shiftGrid1d[idx] = grid[r][c];
                }
            }

            List<List<Integer>> ans = new ArrayList<>();
            for (int r = 0; r < m; r++) {
                List<Integer> row = new ArrayList<>();
                for (int c = 0; c < n; c++) {
                    int idx = (r * n + c ) % (m * n);
                    row.add(shiftGrid1d[idx]);
                }
                ans.add(row);
            }
            return ans;
        }
    }
}
