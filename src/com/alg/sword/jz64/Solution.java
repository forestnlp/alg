package com.alg.sword.jz64;

public class Solution {
    public int Sum_Solution(int n) {
        if(n==1) return 1;
        return Sum_Solution(n-1)+n;
    }
}