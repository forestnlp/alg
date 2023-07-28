package com.alg.leetcode.bit;

public class P1701M {
    class Solution {
        public int add(int a, int b) {
            if(a==0) return b;
            if(b==0) return a;
            while (b!=0) {
                int temp = a&b;
                a=a^b;
                b=temp<<1;
            }
            return a;
        }
    }
}
