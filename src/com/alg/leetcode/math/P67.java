package com.alg.leetcode.math;

public class P67 {
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int la = a.length() - 1;
            int lb = b.length() - 1;
            int carry = 0;
            int sum = 0;
            while (la >= 0 || lb >= 0) {
                int i = la>=0?a.charAt(la--) - '0':0;
                int j = lb>=0?b.charAt(lb--) - '0':0;
                sum = i + j+carry;
                carry = sum / 2;
                sb.insert(0, sum % 2);
            }

            while (la >= 0) {
                sb.insert(0, a.charAt(la)-'0');
                la--;
            }

            while (lb >= 0) {
                sb.insert(0, b.charAt(lb)-'0');
                lb--;
            }

            if (carry > 0)
                sb.insert(0, 1);

            return sb.toString();
        }
    }
}
