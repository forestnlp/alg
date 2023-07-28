package com.alg.leetcode.bit;

public class PM0507 {
    class Solution {
        public int exchangeBits(int num) {
            int mask1 = 0b01010101010101010101010101010101;
            int mask2 = 0b10101010101010101010101010101010;
            int a = num&mask1;
            int b = num&mask2;
            return a<<1|b>>1;
        }
    }
}
