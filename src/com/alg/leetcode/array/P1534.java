package com.alg.leetcode.array;

public class P1534 {
    class Solution {
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
            int cnt=0;
            for(int i=0;i<arr.length-2;i++) {
                int A = arr[i];
                for(int k=i+1;k<arr.length-1;k++) {
                    int B = arr[k];
                    if(Math.abs(A-B)<=a) {
                        for(int j=k+1;j<arr.length;j++) {
                            int C = arr[j];
                            if(Math.abs(B-C)<=b&&Math.abs(A-C)<=c)
                                cnt++;
                        }
                    }
                }
            }
            return cnt;
        }
    }
}
