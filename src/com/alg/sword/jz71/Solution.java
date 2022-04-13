package com.alg.sword.jz71;

public class Solution {
    public int jumpFloorII(int target) {
        if (target<=1) return 1;
       return 1<<(target-1);
    }
}