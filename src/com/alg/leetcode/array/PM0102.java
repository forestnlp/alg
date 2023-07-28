package com.alg.leetcode.array;

public class PM0102 {
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            int[] buckets = new int[26];
            for (char c : s1.toCharArray()) {
                buckets[c - 'a']++;
            }
            for (char c : s2.toCharArray()) {
                buckets[c - 'a']--;
            }
            for(int b:buckets) {
                if(b!=0) return false;
            }
            return true;
        }
    }
}
