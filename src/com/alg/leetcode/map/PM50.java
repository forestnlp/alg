package com.alg.leetcode.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class PM50 {
    class Solution {
        public char firstUniqChar(String s) {
            char[] carr = s.toCharArray();
            Map<Character,Integer> map = new LinkedHashMap<>();
            for(char c:carr) {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for(Map.Entry<Character,Integer> entry:map.entrySet()) {
                if(entry.getValue()==1) return entry.getKey();
            }
            return ' ';
        }
    }
}
