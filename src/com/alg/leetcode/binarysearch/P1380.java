package com.alg.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class P1380 {
    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> row_min = new ArrayList<>();
            List<Integer> col_max = new ArrayList<>();
            for(int i=0;i<matrix.length;i++) {
                int min = Integer.MAX_VALUE;
                for(int k=0;k<matrix[0].length;k++) {
                    min = Math.min(matrix[i][k],min);
                }
                row_min.add(min);
            }

            for(int i=0;i<matrix[0].length;i++) {
                int max = Integer.MIN_VALUE;
                for(int k=0;k<matrix.length;k++) {
                    max = Math.max(matrix[k][i],max);
                }
                col_max.add(max);
            }

            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<row_min.size();i++) {
                if(col_max.contains(row_min.get(i)))
                    ans.add(row_min.get(i));
            }
            return ans;
        }
    }
}
