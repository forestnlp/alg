package com.alg.leetcode.array;

public class P1385 {
    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int cnt=0;
            for(int i=0;i<arr1.length;i++) {
                boolean satisfied=true;
                int a = arr1[i];
                for(int k=0;k<arr2.length;k++) {
                    int b = arr2[k];
                    if(Math.abs(a-b)<=d) {
                        satisfied=false;
                        break;
                    }
                }
                if(satisfied) cnt++;
            }
            return cnt;
        }
    }
}
