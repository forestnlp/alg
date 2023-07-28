package com.alg.leetcode.array;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P1122 {
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {

            Map<Integer, Integer> map = new TreeMap<>();

            for (int i = 0; i < arr1.length; i++) {
                map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
            }

            int j=0;
            for (int i = 0; i < arr2.length; i++) {
                if (map.containsKey(arr2[i])) {
                    int occur = map.get(arr2[i]);
                    while (occur-- > 0) {
                        arr1[j++] = arr2[i];
                    }
                    map.remove(arr2[i]);
                }
            }

            for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
                int occur = entry.getValue();
                while (occur-- > 0) {
                    arr1[j++] = entry.getKey();
                }
            }
            return arr1;
        }
    }
}
