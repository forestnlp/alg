package com.alg.leetcode.bit;

public class PM0506 {
    class Solution {
        public int convertInteger(int A, int B) {
            int xor = A^B;
            return Integer.bitCount(xor);
        }
    }
}
