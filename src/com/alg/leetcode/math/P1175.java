package com.alg.leetcode.math;

public class P1175 {
    class Solution {
        public int numPrimeArrangements(int n) {
            int cnt_prime = 0;
            for(int i=1;i<=n;i++) {
                if(isPrime(i)) cnt_prime++;
            }
            return (int)(p(cnt_prime) * p(n - cnt_prime) % 1000000007);
        }

        public long p(int n) {
            long cnt=1;
            for(int i=2;i<=n;i++)
            {
                cnt *=i;
                cnt = cnt%1000000007;
            }
            return cnt;
        }
        public boolean isPrime(int n) {
            if(n==1) return false;
            for(int i=2;i<=Math.sqrt(n);i++) {
                if(n%i==0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P1175().new Solution();
        System.out.println(solution.numPrimeArrangements(100));
    }
}
