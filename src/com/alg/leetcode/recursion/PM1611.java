package com.alg.leetcode.recursion;

public class PM1611 {
    class Solution {
        public int[] divingBoard(int shorter, int longer, int k) {

            if (k == 0) {
                return new int[0];
            }

            if (shorter == longer)
                return new int[]{shorter * k};

            int[] len = new int[k + 1];
            for (int i = 0; i <= k; i++) {
                len[i] = shorter * (k - i) + longer * i;
            }
            return len;
        }
    }
}
