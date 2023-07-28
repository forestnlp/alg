package com.alg.leetcode.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class P387 {
    class Solution {
        public int firstUniqChar(String s) {
            Map<Character,Integer> map = new LinkedHashMap<>();
            for(int i=0;i<s.length();i++) {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i=0;i<s.length();i++) {
                if(map.get(s.charAt(i))==1) return i;
            }
            return -1;
        }
    }
}
