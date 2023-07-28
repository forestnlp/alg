package com.alg.leetcode.binarysearch;

public class P50M {
    class Solution {

        public double myPow(double x, int n) {
            return n>=0?helper(x,n):1.0/helper(x,-n);
        }

        public double helper(double x,int n) {
            if(n==0) return 1;
            double y = helper(x,n/2);
            if(n%2==0) {
                return  y*y;
            }
            else {
                return y*y*x;
            }
        }
    }
}
