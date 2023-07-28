package com.alg.leetcode.math;

public class P168 {
    class Solution {
        public String convertToTitle(int n) {
            StringBuilder sb = new StringBuilder();
            while (n != 0) {
                n--;
                sb.insert(0,num2char( n % 26));
                n /= 26;
            }
            return sb.toString();
        }

        public char num2char(int n) {
            return (char) ('A' + n);
        }
    }

    public static void main(String[] args) {
        String c = new P168().new Solution().convertToTitle(701);
        System.out.println(c);
    }
}
