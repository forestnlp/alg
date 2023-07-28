package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class P961 {
    class Solution {
        public int repeatedNTimes(int[] A) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int n:A) {
                map.put(n,map.getOrDefault(n,0)+1);
                if(map.getOrDefault(n,0)>1) return n;
            }
            return -1;
        }
    }
}
