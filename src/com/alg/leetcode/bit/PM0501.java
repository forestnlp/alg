package com.alg.leetcode.bit;

public class PM0501{
    class Solution {
        public int insertBits(int N, int M, int i, int j) {
            int n=~((-1>>>(31-j))&(-1<<i));
            N = N&n;
            M = M<<i;
            N = M|N;
            return N;
        }
    }
}
