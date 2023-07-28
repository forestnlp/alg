package com.alg.leetcode.math;

import java.util.LinkedHashMap;
import java.util.Map;

public class P13 {
    class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> map = new LinkedHashMap<Character, Integer>() {{
                put('I',1);
                put('V',5);
                put('X',10);
                put('L',50);
                put('C',100);
                put('D',500);
                put('M',1000);
            }};

            Map<String, Integer> mapRvs = new LinkedHashMap<String, Integer>() {{
                put("IV",2);
                put("IX",2);
                put("XL",20);
                put("XC",20);
                put("CD",200);
                put("CM",200);
            }};

            int ans = 0;
            for(int i=0;i<s.length();i++) {
                ans+=map.get(s.charAt(i));
            }

            for(int i=0;i<s.length()-1;i++) {
                String str = s.substring(i,i+2);
                ans-=mapRvs.getOrDefault(str,0);
            }

            return ans;
        }
    }
}
