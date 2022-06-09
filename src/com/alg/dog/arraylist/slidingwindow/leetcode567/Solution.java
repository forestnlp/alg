package com.alg.dog.arraylist.slidingwindow.leetcode567;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int left = 0, right = 0;
        int valids = 0;
        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> needs = new HashMap<>();

        for (char c : s1.toCharArray()) {
            needs.put(c, needs.getOrDefault(c, 0) + 1);
        }


        while (right < s2.length()) {
            char c = s2.charAt(right++);

            if (needs.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(needs.get(c))) {
                    valids++;
                }
            }

            while (valids == needs.keySet().size()){
                char d = s2.charAt(left++);

                int len = right-left+1;
                if(len==s1.length()){
                    return true;
                }

                if(needs.containsKey(d)){
                    if(window.get(d).equals(needs.get(d))){
                        valids--;
                    }
                    window.put(d,window.get(d)-1);
                }
            }

        }

        return false;
    }
}
