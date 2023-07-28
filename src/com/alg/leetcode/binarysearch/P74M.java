package com.alg.leetcode.binarysearch;

public class P74M {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix==null) return false;
            if(matrix.length==0||matrix[0].length==0) return false;
            int m = matrix.length;
            int n = matrix[0].length;
            int i;
            for(i=0;i<m-1;i++) {
                if(matrix[i][0]<=target&&matrix[i][n-1]>=target)
                    break;
            }
            int index = binarySearch(matrix[i],target);
            return index==-1?false:true;
        }

        public int binarySearch(int[] array, int target) {
            int l = 0, r = array.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (array[m] == target) return m;
                else if (target < array[m]) r = m - 1;
                else l = m + 1;
            }
            return -1;
        }
    }
}
