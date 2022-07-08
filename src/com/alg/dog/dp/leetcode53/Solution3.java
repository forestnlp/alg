package com.alg.dog.dp.leetcode53;

/**
 * @Auther: 刘杰
 * @Date: 2022/7/8 - 07 - 08 - 12:02
 * @Description: com.alg.dog.dp.leetcode53
 * @version: 1.0
 */
public class Solution3 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] preSum = new int[n+1];
        preSum[0] = 0;
        for (int i = 1; i <=n; i++) {
            preSum[i] = preSum[i-1]+nums[i-1];
        }

        int res = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minVal = Math.min(minVal,preSum[i]);
            res = Math.max(res,preSum[i+1]-minVal);
        }
        return res;
    }
}
