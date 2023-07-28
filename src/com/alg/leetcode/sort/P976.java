package com.alg.leetcode.sort;

import java.util.Arrays;

public class P976 {
    class Solution {
        public int largestPerimeter(int[] A) {
            Arrays.sort(A);
            for(int i=A.length-1;i>=2;i--) {
                int a = A[i];
                int b = A[i-1];
                int c = A[i-2];
                if(b+c>a) {
                    return a+b+c;
                }
            }
            return 0;
        }
    }
}
