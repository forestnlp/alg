package com.alg.leetcode.array;

public class P1287 {
    class Solution {
        public int findSpecialInteger(int[] arr) {
            int windowSize = arr.length/4;
            for(int i=0;i<arr.length;i++) {
                if(arr[i]==arr[i+windowSize]) return arr[i];
            }
            return -1;
        }
    }
}
