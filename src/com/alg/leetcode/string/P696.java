package com.alg.leetcode.string;

public class P696 {
    class Solution {
        public int countBinarySubstrings(String s) {
            int left, right;
            int ans = 0;
            for (int i = 1; i < s.length(); i++) {
                left = i - 1;
                right = i;
                if (s.charAt(left) != s.charAt(right)) {
                    while (left > 0 && right < s.length() - 1 && s.charAt(left - 1) == s.charAt(left) && s.charAt(right + 1) == s.charAt(right)) {
                        left--;
                        right++;
                        ans++;
                    }
                    ans++;
                }
            }
            return ans;
        }
    }
}
