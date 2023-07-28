package com.alg.leetcode.array;

public class PM04 {
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if(matrix==null||matrix.length==0||matrix[0].length==0) return false;
            int m = matrix.length,n=matrix[0].length;
            int l=0,r=m-1;

            while (l<=r) {
                int mid = l+(r-l)/2;
                if(matrix[mid][n-1]<target) l = mid+1;
                else if(matrix[mid][0]>target) r = mid-1;
                else break;
            }
            for(int i=l;i<=r;i++) {
                if(matrix[i][n-1]<target) continue;

                if(matrix[i][0]<=target&&matrix[i][n-1]>=target) {
                    if(searchArray(matrix[i],target))
                        return true;
                }
                else {
                    if(matrix[i][0]>target) break;
                }
            }
            return false;
        }

        public boolean searchArray(int[] row, int target) {
            int l = 0, r = row.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (row[m] == target) return true;
                else if (row[m] < target) l = m + 1;
                else r = m - 1;
            }
            return false;
        }
    }
}
