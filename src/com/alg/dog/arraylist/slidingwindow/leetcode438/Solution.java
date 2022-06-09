package com.alg.dog.arraylist.slidingwindow.leetcode438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int left = 0, right = 0;
        int valids = 0;
        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> needs = new HashMap<>();

        for (char c : p.toCharArray()) {
            needs.put(c, needs.getOrDefault(c, 0) + 1);
        }


        while (right < s.length()) {
            char c = s.charAt(right++);

            if (needs.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(needs.get(c))) {
                    valids++;
                }
            }

            while (valids == needs.keySet().size()){
                char d = s.charAt(left++);

                int len = right-left+1;
                if(len==p.length()){
                    ans.add(left-1);
                }

                if(needs.containsKey(d)){
                    if(window.get(d).equals(needs.get(d))){
                        valids--;
                    }
                    window.put(d,window.get(d)-1);
                }
            }

        }

        return ans;
    }
}
