package com.alg.leetcode.math;

public class P231 {
    class Solution {
        public boolean isPowerOfTwo(int n) {

            if(n<=0) return false;
            while (n!=1){
                if(n%2==1) return false;
                n/= 2;
            }
            return true;
        }
    }
}