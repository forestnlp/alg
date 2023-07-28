package com.alg.leetcode.bit;

public class P762 {
    class Solution {
        public int countPrimeSetBits(int L, int R) {
            int ans = 0;
            for(int i=L;i<=R;i++) {
                int cnt = Integer.bitCount(i);
                if(isPrime(cnt)) ans++;
            }
            return ans;
        }

        public boolean isPrime(int n) {
            if(n==1) return false;
            for(int i=2;i<=Math.sqrt(n);i++) {
                if(n%i==0) return false;
            }
            return true;
        }
    }
}
