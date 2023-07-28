package com.alg.leetcode.string;

public class P1446 {
    class Solution {
        public int maxPower(String s) {
            if(s==null||s.length()==0) return 0;
            char[] array = s.toCharArray();
            int count = 1,max = 1;
            char prev = array[0];
            for(int i=1;i<array.length;i++) {
                if(array[i]!=prev) {
                    count=1;
                    prev = array[i];
                }
                else {
                    count++;
                }
                max = Math.max(max,count);
            }
            return max;
        }
    }
}
