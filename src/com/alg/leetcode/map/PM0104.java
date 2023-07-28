package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class PM0104 {
    class Solution {
        public boolean canPermutePalindrome(String s) {
            Map<Character,Integer> map = new HashMap<>();
            char[] ca = s.toCharArray();
            for(char c:ca) {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            int cnt=0;
            for(Map.Entry<Character,Integer> entry:map.entrySet()) {
                if(entry.getValue()%2==1)
                    cnt++;
            }
            if(cnt>1) return false;
            return true;
        }
    }
}
