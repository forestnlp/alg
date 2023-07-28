package com.alg.leetcode.binarysearch;

public class PM53I {
    class Solution {
        public int search(int[] nums, int target) {
            int i = 0, j = nums.length - 1;
            int width = 0;
            while (i <= j) {
                int m = i + (j - i) / 2;
                if (target == nums[m]) {
                    int p, q;
                    p = q = m;
                    while (p > 0 && nums[p - 1] == nums[m]) p--;
                    while (q < nums.length - 1 && nums[q + 1] == nums[m]) q++;
                    width = q - p + 1;
                    break;
                } else if (target < nums[m]) {
                    j = m - 1;
                } else {
                    i = m + 1;
                }
            }
            return width;
        }
    }

    public static void main(String[] args) {
        Solution solution = new PM53I().new Solution();
        int width = solution.search(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println(width);
    }
}
