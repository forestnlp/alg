package com.alg.sword.jz15;

public class Solution {
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n!=0) {
            if((n&1)==1) cnt++;
            n = n>>>1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().NumberOf1(-15));
        System.out.println(new Solution().NumberOf1(15));
    }
}