package com.alg.leetcode.array;

public class P1128 {
    class Solution {
        public int numEquivDominoPairs(int[][] dominoes) {
            int [] buckets = new int[100];
            for(int i=0;i<dominoes.length;i++) {
                int [] pair = dominoes[i];
                int key = Math.max(pair[0],pair[1])*10+Math.min(pair[0],pair[1]);
                buckets[key]++;
            }
            int sum =0;
            for(int i=0;i<buckets.length;i++) {
                if(buckets[i]>1) sum+=buckets[i]*(buckets[i]-1)/2;
            }
            return sum;
        }
    }
}
