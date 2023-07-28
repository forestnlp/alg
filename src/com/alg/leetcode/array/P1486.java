package com.alg.leetcode.array;

public class P1486 {
    class Solution {
        public int xorOperation(int n, int start) {
            int res=start;
            for(int i=1;i<n;i++) {
                int element = start+2*i;
                res ^= element;
            }
            return res;
        }
    }
}
