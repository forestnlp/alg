package com.alg.sword.jz10;

public class Solution {
    public int Fibonacci(int n) {
        if(n<=2) return 1;
        int i0 = 1;
        int i1 = 1;
        int i2 = 0;
        for(int i=2;i<n;i++) {
            i2 = i0 + i1;
            i0 = i1;
            i1 = i2;
        }
        return i2;
    }
}