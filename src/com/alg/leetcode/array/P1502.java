package com.alg.leetcode.array;

import java.util.Arrays;

public class P1502 {
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            Arrays.sort(arr);
            int d = arr[1]-arr[0];
            for(int i=1;i<arr.length;i++) {
                if(arr[i]-arr[i-1]!=d) return false;
            }
            return true;
        }
    }
}
