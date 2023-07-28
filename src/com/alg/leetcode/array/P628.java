package com.alg.leetcode.array;

public class P628 {
    class Solution {
        public int maximumProduct(int[] nums) {
            int a, b, c, d, e;
            a = b = c = Integer.MIN_VALUE;
            d = e = Integer.MAX_VALUE;
            for (int n : nums) {

                if (n > c) {
                    if (n > b) {
                        if (n > a) {
                            c = b;
                            b = a;
                            a = n;
                        } else {
                            c = b;
                            b = n;
                        }
                    } else {
                        c = n;
                    }
                }

                if (n < d) {
                    if (n < e) {
                        d = e;
                        e = n;
                    } else {
                        d = n;
                    }
                }
            }
            return Math.max(a * b * c, a * d * e);
        }
    }
}
