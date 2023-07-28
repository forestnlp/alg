package com.alg.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++) {
                map.put(nums[i],i);
            }
            for(int i=0;i<nums.length;i++) {
                if(map.containsKey(target-nums[i])) {
                    int idx = map.get(target - nums[i]);
                    if (idx != i) {
                        return new int[]{i, idx};
                    }
                }
            }
            return null;
        }
    }
}
