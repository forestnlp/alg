package com.alg.leetcode.array;

public class P605 {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int curr;
            for (int i = 0; i < flowerbed.length; i++) {
                curr = flowerbed[i];
                if (curr == 0) {
                    boolean prev = false, next = false;
                    if (i == 0 || flowerbed[i - 1] == 0) prev = true;
                    if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) next = true;
                    if (prev && next) {
                        flowerbed[i] = 1;
                        n--;
                    }
                    if (n <= 0) return true;
                }
            }
            return n<=0;
        }
    }
}
