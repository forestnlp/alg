package com.alg.leetcode.math;

public class P326 {
    class Solution {
        public boolean isPowerOfThree(int n) {
            if(n==0) return false;
            while (n!=0) {
                if(n==1) return true;
                if(n%3!=0) return false;
                n/=3;
            }
            return true;
        }
    }
}
