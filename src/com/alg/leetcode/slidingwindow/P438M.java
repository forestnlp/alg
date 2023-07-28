package com.alg.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P438M {
    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> ans = new ArrayList<>();
            int left = 0,right =0,valid = 0;
            Map<Character,Integer> needs = new HashMap<>();
            Map<Character,Integer> window = new HashMap<>();

            for(char c:p.toCharArray()) needs.put(c,needs.getOrDefault(c,0)+1);

            while (right<s.length()){
                char c = s.charAt(right);
                right++;
                if(needs.containsKey(c)){
                    window.put(c,window.getOrDefault(c,0)+1 );
                    if(window.get(c)<=needs.get(c)){
                        valid++;
                    }
                }

                while (right-left>=p.length()){
                    char d = s.charAt(left);
                    if(valid==p.length()) {
                        ans.add(left);
                    }
                    left++;
                    if(needs.containsKey(d)){
                        if(window.get(d)<=needs.get(d)){
                            valid--;
                        }
                        window.put(d,window.get(d)-1);
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> ans = solution.findAnagrams("cbaebabacad","aac");
        System.out.println(ans);
    }
}
