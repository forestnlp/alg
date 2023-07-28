package com.alg.leetcode.map;

import java.util.Arrays;

public class P204 {
    class Solution {
        public int countPrimes(int n) {
            boolean [] buckets = new boolean[n];
            Arrays.fill(buckets,true);
            for(int i=2;i*i<n;i++) {
                if(isPrime(i)) {
                    for(int j=i*i;j<n;j+=i) {
                        buckets[j]=false;
                    }
                }
            }
            int ans = 0;
            for(int i=2;i<n;i++) {
                if(buckets[i]) ans++;
            }

            return ans;
        }

        boolean isPrime(int n) {
            for (int i = 2; i*i< n; i++)
                if (n % i == 0)
                    // 有其他整除因子
                    return false;
            return true;
        }

    }
}
