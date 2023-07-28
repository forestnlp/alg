package com.alg.leetcode.string;

public class P67 {
    class Solution {
        public String addBinary(String a, String b) {
            long ia = Long.parseLong(a,2);
            long ib = Long.parseLong(b,2);
            long r = ia+ib;
            return Long.toBinaryString(r);
        }
    }
}
