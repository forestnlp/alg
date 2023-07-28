package com.alg.leetcode.array;

import java.util.*;

public class P532 {
    class Solution {
        public int findPairs(int[] nums, int k) {
            if(k<0) return 0;
            int ans=0;
            Map<Integer,Integer> map = new HashMap<>();
            for(int n:nums){
                map.put(n,map.getOrDefault(n,0)+1);
            }
            for(Map.Entry<Integer,Integer> e:map.entrySet()) {
               int key = e.getKey();
               int val = e.getValue();
               if(k==0){
                   if(val>1) ans++;
               }
               else {
                   if(map.containsKey(key-k))
                       ans++;
               }
            }
            return ans;
        }
    }
}
