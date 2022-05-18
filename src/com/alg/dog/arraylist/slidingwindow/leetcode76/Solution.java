package com.alg.dog.arraylist.slidingwindow.leetcode76;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        int left = 0, right = 0, len = Integer.MAX_VALUE, start = 0;
        int valids = 0;

        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> needs = new HashMap<>();

        for (char c : t.toCharArray()) {
            needs.put(c, needs.getOrDefault(c, 0) + 1);
        }

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (needs.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.getOrDefault(c,0) .equals( needs.get(c)))
                    valids++;
            }

            while (valids == needs.size()) {
                if (right - left  < len) {
                    start = left;
                    len = right - left ;
                }
                char d = s.charAt(left);
                left++;
                if(needs.containsKey(d)){
                    if(window.get(d).equals(needs.get(d))){
                        valids--;
                    }
                    window.put(d,window.get(d)-1);
                }
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,start+len);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.minWindow("abcdefghigjklmnabcdefghigjklmn", "cdmjkmk");
        System.out.println(s);
    }
}