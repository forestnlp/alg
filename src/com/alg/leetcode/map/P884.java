package com.alg.leetcode.map;

import java.util.*;

public class P884 {
    class Solution {
        public String[] uncommonFromSentences(String A, String B) {
            Map<String,Integer> mapAB = new HashMap<>();

            String[] arrA = A.split("\\s");
            String[] arrB = B.split("\\s");

            for(int i=0;i<arrA.length;i++) {
                mapAB.put(arrA[i], mapAB.getOrDefault(arrA[i],0)+1);
            }

            for(int i=0;i<arrB.length;i++) {
                mapAB.put(arrB[i], mapAB.getOrDefault(arrB[i],0)+1);
            }

            List<String> ans = new ArrayList<>();
            for(Map.Entry<String,Integer> entry:mapAB.entrySet()) {
                if(entry.getValue()==1)
                    ans.add(entry.getKey());
            }

            return ans.toArray(new String[ans.size()]);
        }
    }
}
