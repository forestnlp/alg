package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class P594 {
    class Solution {
        public int findLHS(int[] nums) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int n:nums) {
                map.put(n,map.getOrDefault(n,0)+1);
            }
            int ans = 0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
                int key = entry.getKey();
                int cnt = entry.getValue();
                if(map.containsKey(key+1)) {
                    ans= Math.max(ans,cnt+map.getOrDefault(key+1,0));
                }
            }
            return ans;
        }
    }
}
