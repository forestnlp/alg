package com.alg.leetcode.math;

public class P492 {
    static class Solution {
        public int[] constructRectangle(int area) {
            int sqrt = (int) Math.sqrt(area);
            for(int i=sqrt;i>=0;i--)
            {
                if (area%i==0) return new int[]{area/i,i};
            }
            return new int[0];
        }
    }
}
