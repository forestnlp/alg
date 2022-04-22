package com.alg.sword.jz19;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str     string字符串
     * @param pattern string字符串
     * @return bool布尔型
     */
    public boolean match(String str, String pattern) {
        if (str == null || pattern == null) return false;
        int m = str.length();
        int n = pattern.length();
        char[] s = str.toCharArray();
        char[] p = pattern.toCharArray();
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;
        //第一行*
        for (int i = 2; i < n + 1; i++) {
            if (p[i - 1] == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }

        for (int i = 1; i < dp.length; i++) {
            char cs = s[i - 1];
            for (int j = 1; j < dp[0].length; j++) {
                char cp = p[j - 1];
                if (cp == '.' || cp == cs) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (cp != cs && cp != '*') {
                    dp[i][j] = false;
                } else if (cp == '*') {
                    //匹配0次
                    if (p[j - 2] != s[i - 1] && p[j - 2] != '.') {
                        dp[i][j] = dp[i][j - 2];
                    }
                    else {
                        //左一、左二、上方
                        dp[i][j] = dp[i][j-1]||dp[i][j-2]||dp[i-1][j];
                    }
                }
            }
        }
        return dp[m][n];
    }
}