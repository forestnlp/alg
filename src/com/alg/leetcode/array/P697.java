package com.alg.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class P697 {
    class Solution {
        public int findShortestSubArray(int[] nums) {
            Map<Integer,Integer> occurMap = new HashMap<>();
            Map<Integer,Integer> lefmostMap = new HashMap<>();
            Map<Integer,Integer> rightmostMap = new HashMap<>();
            for(int i=0;i<nums.length;i++) {
                occurMap.put(nums[i],occurMap.getOrDefault(nums[i],0)+1);
                if(!lefmostMap.containsKey(nums[i]))
                    lefmostMap.put(nums[i],i);
                rightmostMap.put(nums[i],i);
            }

            int mostfreq = 0;
            for(Map.Entry<Integer,Integer> e :occurMap.entrySet()) {
                if(e.getValue()>mostfreq) {
                    mostfreq = e.getValue();
                }
            }

            int minlen = nums.length;
            int target = -1;

            for(Map.Entry<Integer,Integer> e :occurMap.entrySet()) {
                if(e.getValue()==mostfreq)
                    target = e.getKey();
                int len = rightmostMap.get(target)-lefmostMap.get(target)+1;
                minlen = Math.min(len,minlen);
            }
            return minlen;
        }
    }
}
