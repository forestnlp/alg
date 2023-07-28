package com.alg.leetcode.array;

public class P485 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int curlen = 0, maxlen = 0;
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] ==1)
                    curlen++;
                else
                    curlen=0;

                if (curlen > maxlen)
                    maxlen = curlen;
            }
            return maxlen;
        }
    }
}
