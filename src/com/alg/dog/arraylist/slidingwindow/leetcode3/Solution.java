package com.alg.dog.arraylist.slidingwindow.leetcode3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0, right = 0;

        int maxlen = 0;

        Map<Character, Integer> window = new HashMap<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;

            window.put(c, window.getOrDefault(c, 0) + 1);

            while (window.get(c) > 1) {
                char d = s.charAt(left);
                left++;
                window.put(d, window.getOrDefault(d, 0) - 1);
            }

            maxlen = Math.max(maxlen, right - left);
        }
        return maxlen;
    }
}
