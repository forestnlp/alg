package com.alg.leetcode.map;

public class P409 {
    class Solution {
        public int longestPalindrome(String s) {
            char[] carr = s.toCharArray();
            int[] countarr = new int[128];
            for (int i = 0; i < carr.length; i++) {
                countarr[carr[i]]++;
            }
            int ans = 0;
            for (int i = 0; i < countarr.length; i++) {
                int times = countarr[i];
                if (times % 2 == 0) {
                    ans += times;
                } else {
                    ans += times / 2 * 2;
                    if (ans % 2 == 0) ans++;
                }
            }
            return ans;
        }
    }
}
