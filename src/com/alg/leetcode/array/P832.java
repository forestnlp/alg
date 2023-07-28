package com.alg.leetcode.array;

public class P832 {
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            for(int i=0;i<A.length;i++) {
                flipAndInvert(A[i]);
            }
            return A;
        }

        void flipAndInvert(int [] a) {
            int l =0,r=a.length-1;
            while (l<=r) {
                int tmp = a[r];
                a[r] = 1-a[l];
                a[l] = 1-tmp;
                l++;r--;
            }
        }
    }
}
