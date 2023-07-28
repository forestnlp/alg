package com.alg.leetcode.array;

public class P1051 {
    class Solution {
        public int heightChecker(int[] heights) {
            int[] buckets = new int[101];
            for (int h : heights) {
                buckets[h] += 1;
            }

            int cnt = 0;
            for (int i = 0, j = 0; i < buckets.length; i++) {
                while (buckets[i] > 0) {
                    if (i != heights[j])
                        cnt++;
                    buckets[i]--;
                    j++;
                }
            }

            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P1051().new Solution();
        int cnt = solution.heightChecker(new int[]{5,1,2,3,4});
        System.out.println(cnt);
    }
}
