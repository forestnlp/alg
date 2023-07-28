package com.alg.leetcode.string;

import java.util.*;

public class P893 {
    class Solution {
        public int numSpecialEquivGroups(String[] A) {
            List<Character> s1, s2;
            Map<String,Integer> map = new HashMap<>();
            for (String a : A) {
                s1 = new ArrayList<Character>();
                s2 = new ArrayList<Character>();
                for (int i = 0; i < a.length(); i++) {
                    if (i % 2 == 0) s1.add(a.charAt(i));
                    else s2.add(a.charAt(i));
                }
                Collections.sort(s1);
                Collections.sort(s2);
                String key = s1.toString()+s2.toString();
                map.put(key,map.getOrDefault(key,0)+1);
            }
            return map.size();
        }
    }

    public static void main(String[] args) {
        String [] A = {"couxuxaubw","zsptcwcghr","kkntvvhbcc","nkhtcvvckb","crcwhspgzt"};
        int a = new P893().new Solution().numSpecialEquivGroups(A);
        System.out.println(a);
    }
}
