package com.alg.leetcode.bit;

public class P342 {
    class Solution {
        public boolean isPowerOfFour(int num) {
            if(num<=0) return false;
            if((num&(num-1))!=0) return false;
            if(num==(num&0x55555555)) return true;
            return false;
        }
    }
}
