package com.alg.sword.jz70;

public class Solution {
    public int rectCover(int target) {
        if (target == 1) return 1;
        if (target == 2) return 2;
        int i1 = 1;
        int i2 = 2;
        int i3=0;
        for(int i=3;i<=target;i++){
            i3 = i1+i2;
            i1=i2;
            i2=i3;
        }
        return i3;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().rectCover(4));
    }
}