package com.alg.leetcode.greedy;

import java.util.Arrays;

public class P1005 {
    class Solution {
        public int largestSumAfterKNegations(int[] A, int K) {
            Arrays.sort(A);
            for(int i=0;i<A.length;i++) {
                if(A[i]<0&&K>0){
                    A[i]=-A[i];
                    K--;
                }
                else break;
            }
            int sum = 0;
            if(K%2==0) {
                for(int n:A) {
                    sum+=n;
                }
            }
            else {
                Arrays.sort(A);
                A[0]=-A[0];
                for(int n:A) {
                    sum+=n;
                }
            }
            return sum;
        }
    }
}
