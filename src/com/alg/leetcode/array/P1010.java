package com.alg.leetcode.array;

public class P1010 {
    class Solution {
        public int numPairsDivisibleBy60(int[] time) {
            int[] buckets = new int[60];
            for (int i = 0; i < time.length; i++) {
                buckets[time[i] % 60] += 1;
            }

            int count = 0;
            for (int i = 0; i < buckets.length; i++) {
                if (buckets[i] == 0) continue;
                if (i == 0 || i == 30)
                    count += buckets[i] * (buckets[i] - 1);
                else
                    count += buckets[i] * buckets[60 - i];
            }
            return count / 2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P1010().new Solution();
        int r = solution.numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40});
        System.out.printf("r:" + r);
    }
}
