package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class P299 {
    class Solution {
        public String getHint(String secret, String guess) {
            Map<Character,Integer> mapSec = new HashMap<>();
            Map<Character,Integer> mapGes = new HashMap<>();
            int bull=0;
            for(int i=0;i<secret.length();i++) {
                if(secret.charAt(i)==guess.charAt(i)) bull++;
                else {
                    mapGes.put(guess.charAt(i),mapGes.getOrDefault(guess.charAt(i),0)+1);
                    mapSec.put(secret.charAt(i),mapSec.getOrDefault(secret.charAt(i),0)+1);
                }
            }
            int cow = 0;
            for(char c : mapGes.keySet()) {
                if(mapSec.containsKey(c)) {
                    cow+=Math.min(mapGes.get(c),mapSec.get(c));
                }
            }
            return bull+"A"+cow+"B";
        }
    }
}
