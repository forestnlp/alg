package com.alg.leetcode.array;

public class P88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int p = m + n;
            while (n > 0 && m > 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[--p] = nums1[--m];
                } else {
                    nums1[--p] = nums2[--n];
                }
            }
            for(int i=1;i<=n;i++) {
                nums1[i-1] = nums2[i-1];
            }
        }
    }
}
