package com.alg.leetcode.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1403 {
    class Solution {
        public List<Integer> minSubsequence(int[] nums) {
            Arrays.sort(nums);
            int sum = 0;
            for (int n : nums) {
                sum += n;
            }

            int halfsum = 0;
            List<Integer> ans = new ArrayList<>();
            for (int i=nums.length-1;i>=0;i--) {
                halfsum += nums[i];
                ans.add(nums[i]);
                if (halfsum > sum - halfsum) break;
            }
            return ans;
        }
    }
}
