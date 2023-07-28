package com.alg.leetcode.string;

import java.util.Map;
import java.util.TreeMap;

public class P1370 {
    class Solution {
        public String sortString(String s) {
            char[] chars = s.toCharArray();
            Map<Character,Integer> map = new TreeMap<Character,Integer>();
            for(char c:chars) {
                map.put(c,map.getOrDefault(c,0)+1);
            }

            StringBuffer sb = new StringBuffer();
            int times = 0;
            while (sb.length()<s.length()) {
                StringBuffer tmp = new StringBuffer();
                for(Map.Entry<Character, Integer> entry:map.entrySet()) {
                    int freq = entry.getValue();
                    if(freq>0) {
                        char c = entry.getKey();
                        if(times%2==0) {
                            tmp.append(c);
                        }
                        else {
                            tmp.insert(0,c);
                        }
                        entry.setValue(freq-1);
                    }
                }
                times++;
                sb.append(tmp);
            }
            return sb.toString();
        }
    }
}
