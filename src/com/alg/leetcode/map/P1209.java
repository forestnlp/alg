package com.alg.leetcode.map;

import java.util.HashSet;
import java.util.Set;

public class P1209 {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            int [] buckets = new int[2001];
            for(int i=0;i<arr.length;i++) {
                buckets[arr[i]+1000]++;
            }

            Set<Integer> set = new HashSet<>();
            for(int i=0;i<buckets.length;i++) {
                if(buckets[i]==0) continue;
                if(set.contains(buckets[i]))
                    return false;
                set.add(buckets[i]);
            }
            return true;
        }
    }
}
