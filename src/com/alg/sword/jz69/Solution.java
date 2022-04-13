package com.alg.sword.jz69;

public class Solution {
    public int jumpFloor(int target) {
        int i1 = 1;
        int i2 = 2;
        if (target<3) return target;
        int i3 = 0;
        for (int i = 3; i <= target; i++) {
            i3 = i1+i2;
            i1= i2;
            i2 = i3;
        }
        return i3;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.jumpFloor(7);
        System.out.println(i);
    }
}