package com.alg.leetcode.recursion;

public class PM10II {
    class Solution {

        public int numWays(int n) {
            if(n==0) return 1;
            if(n==1) return 1;
            if(n==2) return 2;
            long[] dp = new long[n + 1];
            dp[0] = 1l;
            dp[1] = 1l;
            dp[2] = 2l;
            for(int i=2;i<=n;i++) {
                dp[i] = (dp[i-1]+dp[i-2])%1000000007;
            }
            return (int)(dp[n]%1000000007);
        }
    }
}
