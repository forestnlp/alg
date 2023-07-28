package com.alg.leetcode.binarysearch;

public class P852 {
    class Solution {
        public int peakIndexInMountainArray(int[] A) {

            int i=0,j=A.length-1;
            while (i<j) {
                int m = i+(j-i)/2;
                if(A[m]<A[m+1]) i=m+1;
                else j = m;
            }
            return i;
        }
    }
}
