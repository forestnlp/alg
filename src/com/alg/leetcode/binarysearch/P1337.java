package com.alg.leetcode.binarysearch;

import java.util.*;

public class P1337 {

    class Row implements Comparable<Row> {
        int index;
        int soldiers;

        public Row(int index, int soldiers) {
            this.index = index;
            this.soldiers = soldiers;
        }

        @Override
        public int compareTo(Row o) {
            int cmp =  this.soldiers-o.soldiers;
            if(cmp==0) cmp = this.index-o.index;
            return cmp;
        }
    }

    class Solution {

        public int[] kWeakestRows(int[][] mat, int k) {
            int m = mat.length;
            int n = mat[0].length;

            PriorityQueue<Row> queue = new PriorityQueue<>();

            for(int i=0;i<m;i++) {
                int soldiers = countSoldiers(mat[i]);
                queue.offer(new Row(i,soldiers));
            }

            int[] weakestRows = new int[k];
            for(int i=0;i<k;i++) {
                weakestRows[i] = queue.poll().index;
            }
            return weakestRows;
        }

        public int countSoldiers(int [] array) {
            int i=0,j=array.length-1;
            while (i<=j) {
                int m = i+(j-i)/2;
                if(array[m]==1) i=m+1;
                else if(array[m]==0) j=m-1;
            }
            return i;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P1337().new Solution();
        int[][] mat  = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int[] rtn = solution.kWeakestRows(mat,3);
        for(int i=0;i<rtn.length;i++) {
            System.out.println(rtn[i]);
        }
    }
}
