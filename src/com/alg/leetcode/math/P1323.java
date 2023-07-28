package com.alg.leetcode.math;

public class P1323 {
    class Solution {
        public int maximum69Number(int num) {
            String res = String.valueOf(num).replaceFirst("6","9");
            return Integer.parseInt(res);
        }
    }

    public static void main(String[] args) {
        int n = new P1323().new Solution().maximum69Number(9669);
        System.out.println(n);
    }
}
