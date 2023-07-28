package com.alg.leetcode.array;

public class P888 {
    class Solution {
        public int[] fairCandySwap(int[] A, int[] B) {
            int sumA=0,sumB=0;
            for(int n:A) sumA+=n;
            for(int n:B) sumB+=n;

            int delta = (sumA-sumB)/2;
            for(int n:A) {
                int target = n-delta;
                for(int m:B) {
                    if(m==target)
                        return new int[]{n,m};
                }
            }
            return null;
        }
    }
}
