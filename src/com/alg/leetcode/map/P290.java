package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class P290 {
    class Solution {
        public boolean wordPattern(String pattern, String str) {
            Map<Character,String> map = new HashMap<>();
            char[] parr = pattern.toCharArray();
            String[] strarr = str.split("\\s");
            if(parr.length!=strarr.length) return false;
            for(int i=0;i<parr.length;i++) {
                if(map.containsKey(parr[i])) {
                    if(!strarr[i].equals(map.get(parr[i]))) return false;
                }
                else {
                    if(map.containsValue(strarr[i])) return false;
                    map.put(parr[i],strarr[i]);
                }
            }
            return true;
        }
    }
}
