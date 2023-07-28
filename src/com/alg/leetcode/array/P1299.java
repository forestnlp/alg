package com.alg.leetcode.array;

public class P1299 {
    class Solution {
        public int[] replaceElements(int[] arr) {
            int[] ans = new int[arr.length];
            int max=Integer.MIN_VALUE;
            ans[arr.length-1]=-1;
            int prev = arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--) {
                max = Math.max(max,prev);
                ans[i]=max;
                prev = arr[i];
            }
            return ans;
        }
    }
}
