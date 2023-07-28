package com.alg.leetcode.binarysearch;

public class P1351 {
    class Solution {
        public int countNegatives(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int cnt = 0;
            for(int i=0;i<m;i++) {
                int idx = findNegative(grid[i]);
                if(idx!=-1)
                    cnt += n-idx;
            }
            return cnt;
        }

        public int findNegative(int [] array) {
            int i=0,j=array.length-1;
            while (i<j) {
                int m = i + (j-i)/2;
                if(array[m]>=0) i=m+1;
                else j=m;
            }
            if(array[i]<0) return i;
            else  return -1;
        }
    }

    public static void main(String[] args) {
        Solution plan = new P1351().new Solution();
        int[] array = new int[]{10,0,0,0,-1,-2};
        int i =plan.findNegative(array);
        System.out.println(i);
        System.out.println(array[i]);
    }
}
