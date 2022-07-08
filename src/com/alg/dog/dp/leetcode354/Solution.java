package com.alg.dog.dp.leetcode354;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                } else{
                    return o1[0] - o2[0];
                }
            }
        });

        int[] dp = new int[envelopes.length];
        Arrays.fill(dp,1);

        for (int i = 0; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if(envelopes[i][1]>envelopes[j][1]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < envelopes.length; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}