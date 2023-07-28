package com.alg.leetcode.math;

public class P1317 {
    class Solution {
        public int[] getNoZeroIntegers(int n) {
            for(int i=1;i<n/2;i++) {
                String s1 = String.valueOf(i);
                String s2 = String.valueOf(n-i);
                if(s1.contains("0")||s2.contains("0")) continue;
                return new int[]{i,n-i};
            }
            return new int[0];
        }
    }
}
