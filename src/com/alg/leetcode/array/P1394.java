package com.alg.leetcode.array;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class P1394 {
    class Solution {
        public int findLucky(int[] arr) {

            Map<Integer,Integer> map = new TreeMap<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });

            for(int n:arr) {
                map.put(n,map.getOrDefault(n,0)+1);
            }

            for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
                if(entry.getKey()==entry.getValue()) {
                    return entry.getValue();
                }
            }
            return -1;
        }
    }
}
