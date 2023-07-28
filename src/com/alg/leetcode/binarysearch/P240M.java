package com.alg.leetcode.binarysearch;

public class P240M {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
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

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 20;
        boolean b = new P240M().new Solution().searchMatrix(matrix, target);
        System.out.println(b);
    }
}

