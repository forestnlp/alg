package com.alg.leetcode.math;

import java.util.Arrays;

public class P1619 {
    class Solution {
        public double trimMean(int[] arr) {
            int length = arr.length;
            int index = (int)(length * 0.05);
            Arrays.sort(arr);
            double sum = 0;
            for (int i = index; i < length - index; i ++){
                sum += arr[i];
            }
            return sum / (length - 2 * index);
        }
    }
}
