package com.alg.leetcode.bit;

public class P476 {
    class Solution {
        public int findComplement(int num) {
            long n = 1;
            while (n<=num) n<<=1;
            return (int)(n-num-1);
        }
    }
}
