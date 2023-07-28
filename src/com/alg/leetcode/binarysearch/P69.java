package com.alg.leetcode.binarysearch;

public class P69 {
    class Solution {
        public int mySqrt(int x) {
             if(x==0) return 0;

             double epsilon = 1e-7;

             double a = x;
             while (true) {
                 double a0 = 0.5*a + 0.5*x/a;
                 if(Math.abs(a0-a)<epsilon)
                     break;
                 else
                    a = a0;
             }
             return (int)a;
        }
    }
}
