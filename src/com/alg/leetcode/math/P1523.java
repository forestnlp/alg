package com.alg.leetcode.math;

public class P1523 {
    class Solution {
        public int countOdds(int low, int high) {
            int cntlow = (low)/2;
            int cnthigh = (1+high)/2;
            return cnthigh-cntlow;
        }
    }
}
