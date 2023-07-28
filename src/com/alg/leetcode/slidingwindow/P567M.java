package com.alg.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class P567M {
    static class Solution {
        public boolean checkInclusion(String s1, String s2) {
            //define some variables
            int left=0,right=0,valid=0;
            //contains the s1 and window
            Map<Character,Integer> needs = new HashMap<>();
            Map<Character,Integer> window = new HashMap<>();
            //construct the needs
            for(char c:s1.toCharArray()){
                needs.put(c,needs.getOrDefault(c,0)+1);
            }

            while (right<s2.length()){
                char c = s2.charAt(right);
                right++;

                //extend window
                if(needs.containsKey(c)){
                    window.put(c,window.getOrDefault(c,0)+1);
                    if(needs.get(c)>=window.get(c))
                        valid++;
                }

                //shrikwindow
                while (right-left>=s1.length()){
                    if(valid==s1.length())
                       return true;
                    char d = s2.charAt(left);
                    left++;
                    if(needs.containsKey(d)){
                        if(window.get(d)<=needs.get(d))
                            valid--;
                        window.put(d,window.get(d)-1);
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.checkInclusion("adc","ddaec");
        System.out.println(b);
    }
}
