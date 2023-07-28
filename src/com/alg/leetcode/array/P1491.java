package com.alg.leetcode.array;

public class P1491 {
    class Solution {
        public double average(int[] salary) {
            int max=Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int total=0;
            for(int n:salary) {
                max = Math.max(max,n);
                min = Math.min(min,n);
                total+=n;
            }
            return salary.length>2?(total-max-min)/(salary.length-2.0):0;
        }
    }
}
