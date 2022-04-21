package com.alg.sword.jz67;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param s string字符串
     * @return int整型
     */
    public int StrToInt(String s) {
        // write code here
        s = s.trim();
        if (s.equals("")) return 0;

        int neg = 1;
        int i = 0;
        char sign = s.charAt(0);
        if (sign == '-') {
            neg = -1;
            i++;
        } else if (sign == '+')  {
            neg = 1;
            i++;
        }

        long num = 0;
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > '9' || c < '0') break;
            num = num * 10 + c - '0';
            if (neg == 1 && num>Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            else if(neg==-1&&num*-1<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int) (num*neg);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().StrToInt("q12"));
    }
}