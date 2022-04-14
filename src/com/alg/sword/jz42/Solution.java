package com.alg.sword.jz42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) return 0;
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (dp[i - 1] < 0)
                dp[i] = array[i];
            else
                dp[i] = dp[i - 1] + array[i];
        }
        int max = Integer.MIN_VALUE;
        for (int a : dp) {
            if (a > max) max = a;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.FindGreatestSumOfSubArray(new int[]{1, -2, 3, 10, -4, 7, 2, -5});
        System.out.println(ans);
    }
}