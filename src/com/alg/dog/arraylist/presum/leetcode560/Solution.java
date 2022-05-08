package com.alg.dog.arraylist.presum.leetcode560;

import java.util.HashMap;

public class Solution {

    private int res = 0;

    /**
     *  preMap 记录[0-j]的前缀和
     *  通过target查找 j的位置。于是子数组就是j~i
     */

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> preMap = new HashMap<>();
        int preSum = 0;
        preMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            int target = preSum - k;
            res += preMap.getOrDefault(target, 0);
            preMap.put(preSum, preMap.getOrDefault(preSum, 0) + 1);
        }
        return res;
    }
}