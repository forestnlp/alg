package com.alg.dog.dp.leetcode53;

/**
 * @Auther: 刘杰
 * @Date: 2022/7/8 - 07 - 08 - 11:49
 * @Description: com.alg.dog.dp.leetcode53
 * @version: 1.0
 */
public class Solution2 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int dp_0 = nums[0];
        int dp_1 = 0, res = dp_0;

        for (int i = 1; i < nums.length; i++) {
            dp_1 = Math.max(nums[i],nums[i]+dp_0);
            dp_0 = dp_1;
            res = Math.max(dp_1,res);
        }
        return res;
    }
}
