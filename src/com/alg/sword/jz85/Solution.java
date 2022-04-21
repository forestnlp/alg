package com.alg.sword.jz85;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] FindGreatestSumOfSubArray(int[] array) {
        // write code here
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int left = 0, right = 0, max = dp[0];
        int max_left = 0, max_right = 0, max_len = 1;
        for (int i = 1; i < array.length; i++) {
            right++;

            dp[i] = Math.max(array[i], dp[i - 1] + array[i]);

            if (dp[i - 1] + array[i] < array[i]) {
                left = right;
            }

            if (dp[i] > max || dp[i] == max && right -left + 1 > max_len) {
                max_right = right;
                max_left = left;
                max_len = max_right - max_left + 1;
                max = dp[i];
            }
        }
        int[] result = new int[max_len];
        int k = 0;
        for (int i = max_left; i <= max_right; i++) {
            result[k++] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = new Solution().FindGreatestSumOfSubArray(new int[]{-1,-2,-3,-4,5});
        for (int n : result) {
            System.out.println(n);
        }
    }
}