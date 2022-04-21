package com.alg.sword.jz44;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param n int整型
     * @return int整型
     */
    public int findNthDigit(int n) {
        if(n<10) return n;
        // write code here

        n-=10;
        int digits = 2;

        int m = n;
        while (true) {
            long cnt = count(digits);
            if ( cnt * digits > m) break;
            m -= cnt * digits;
            digits++;
        }

        int start = (int) Math.pow(10,digits-1);
        int more = m/digits;
        int offset = m%(digits);

        return String.valueOf(start+more).charAt(offset)-'0';
    }

    private long count(int level) {
        if (level == 2) return 90;
        return 10 * count(level - 1);
    }

    public int findNthDigit2 (int n) {
        // write code here
        if(n < 10)
            return n;
        n -= 10;
        int digit = 2;
        long num = 10, sum = 90;
        while(n - digit * sum >= 0) {
            n -= digit * sum;
            digit++;
            sum *= 10;
            num *= 10;
        }
        int div = n / digit;
        int mod = n % digit;
        long now = num + div;
        return String.valueOf(now).charAt(mod) - '0';
    }

    public static void main(String[] args) {
        int index = (int) Math.pow(10,9);
        System.out.println(new Solution().findNthDigit(index));
        System.out.println(new Solution().findNthDigit2(index));

    }
}