package com.alg.sword.jz83;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param number long长整型
     * @return long长整型
     */
    public long cutRope(long number) {
        // write code here
        if (number == 1) return 1;
        if (number == 2) return 1;
        if (number == 3) return 2;
        if (number == 4) return 4;
        long mod = number % 3;
        if (mod == 0) return powof3(number / 3);
        else if (mod == 1) return powof3(number / 3 - 1) * 4 % 998244353;
        else return powof3(number / 3) * 2 % 998244353;
    }

    public long powof3(long n) {
        if (n == 0) return 1;
        if (n == 1) return 3;
        long p = powof3(n / 2);
        if ((n & 1) == 0) return p * p % 998244353;
        return 3 * p * p % 998244353;
    }
}