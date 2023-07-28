package com.alg.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class P1512 {
    class Solution {
        public int numIdenticalPairs(int[] nums) {

            Map<Integer, Integer> map = new HashMap<>();
            for(int n:nums) {
                map.put(n,map.getOrDefault(n,0)+1);
            }

            int ans=0;

            for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
                int val = entry.getValue();
                if(val>1){
                    ans+=(val-1)*val/2;
                }
            }

            return ans;
        }
    }
}
