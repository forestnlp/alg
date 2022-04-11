package com.alg.sword.jz15;

public class Solution2 {
    public int NumberOf1(int n) {
        int cnt = 0;
        //每一次均消去最右边的1
        while (n!=0) {
            n = n&(n-1);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().NumberOf1(-15));
        System.out.println(new Solution2().NumberOf1(15));
    }
}