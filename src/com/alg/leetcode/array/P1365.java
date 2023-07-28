package com.alg.leetcode.array;

public class P1365 {
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] freq = new int[101];
            for (int n : nums) {
                freq[n]++;
            }
            for (int i = 1; i < freq.length; i++) {
                freq[i] += freq[i - 1];
            }

            int[] ans = new int[nums.length];
            for(int i=0;i<ans.length;i++) {
               if(nums[i]>0) ans[i] = freq[nums[i]-1];
               else ans[i]=0;
            }
            return ans;
        }
    }
}
