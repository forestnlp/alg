package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P771 {
    class Solution {
        public int numJewelsInStones(String J, String S) {
            Map<Character,Integer> map = new HashMap<>();
            Set<Character> Jset = new HashSet<>();
            for(char c:J.toCharArray())
                Jset.add(c);
            int ans=0;
            for(int i=0;i<S.length();i++) {
                char c = S.charAt(i);
                if(Jset.contains(c))
                map.put(c,map.getOrDefault(c,0)+1);
            }

            for(char c:map.keySet()){
                ans+=map.get(c);
            }
            return ans;
        }
    }
}
