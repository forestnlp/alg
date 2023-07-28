package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class P953 {
    class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            Map<Character,Integer> map = new HashMap<>();
            char[] carr = order.toCharArray();
            for(int i=0;i<carr.length;i++) map.put(carr[i],i);
            for(int i=0;i<words.length-1;i++) {
                String word1 = words[i];
                String word2 = words[i+1];
                if(!lessthan(word1,word2,map)) return false;
            }
            return true;
        }

        public boolean lessthan(String word1, String word2, Map<Character,Integer> order) {
            int l1 = word1.length();
            int l2= word2.length();
            int l =Math.min(l1,l2);
            for(int i=0;i<l;i++) {
                char c1 = word1.charAt(i);
                char c2 = word2.charAt(i);
                int idx1 = order.get(c1);
                int idx2 = order.get(c2);
                if(idx1>idx2) return false;
                else if(idx1<idx2) return true;
            }
            if(l1<l2) return true;
            else return false;
        }
    }
}
