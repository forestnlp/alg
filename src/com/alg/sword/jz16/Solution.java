package com.alg.sword.jz16;

public class Solution {
    public double Power(double base, int exponent) {

        if(exponent<0) {
            base = 1/base;
            exponent *= -1;
        }

        if(exponent==0) return 1;
        if(exponent==1) return base;
        return Power(base,exponent/2)*Power(base,exponent-exponent/2);

  }
}