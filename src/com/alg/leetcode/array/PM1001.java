package com.alg.leetcode.array;

public class PM1001 {
    class Solution {
        public void merge(int[] A, int m, int[] B, int n) {
            int pa = m, pb = n;
            int t = m + n - 1;
            while (t >= 0) {
                if (pa > 0 && pb > 0) {
                    if (A[pa-1] > B[pb-1]) {
                        A[t] = A[pa-1];
                        pa--;
                    } else {
                        A[t] = B[pb-1];
                        pb--;
                    }
                } else if (pa == 0) {
                    A[t] = B[pb-1];
                    pb--;
                } else if (pb == 0) {
                    A[t] = A[pa-1];
                    pa--;
                }
                t--;
            }
        }
    }
}
