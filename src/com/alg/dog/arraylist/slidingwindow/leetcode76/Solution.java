package com.alg.dog.arraylist.slidingwindow.leetcode76;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String minWindow(String s, String t) {

        int left = 0, right = 0;

        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int valid = 0;
        int minlen = Integer.MAX_VALUE;
        int start = -1;

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.getOrDefault(c, 0).equals(need.get(c)))
                    valid++;
            }

            while (valid == need.keySet().size()) {
                int len = right - left;
                if (len < minlen) {
                    start = left;
                    minlen = len;
                }

                char d = s.charAt(left);
                left++;

                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}
