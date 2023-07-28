package com.alg.leetcode.array;

public class P896 {
    class Solution {
        public boolean isMonotonic(int[] A) {
            if (A == null || A.length == 0) return false;
            int start = A[0];
            int end = A[A.length - 1];
            if (start == end) {
                for (int i = 1; i < A.length; i++) {
                    if(A[i]!=A[i-1]) return false;
                }
            } else if (start < end) {
                for (int i = 1; i < A.length; i++) {
                    if(A[i]<A[i-1]) return false;
                }
            } else {
                for (int i = 1; i < A.length; i++) {
                    if(A[i]>A[i-1]) return false;
                }
            }

            return true;
        }
    }
}
