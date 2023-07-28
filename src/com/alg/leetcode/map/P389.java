package com.alg.leetcode.map;

public class P389 {
    class Solution {
        public char findTheDifference(String s, String t) {
            int[] buckets = new int[128];
            for(int i=0;i<s.length();i++) {
                buckets[s.charAt(i)]++;
                buckets[t.charAt(i)]--;
            }
            buckets[t.charAt(t.length()-1)]--;
            for(int i=0;i<buckets.length;i++) {
                if(buckets[i]==1) return (char)i;
            }
            return ' ';
        }
    }
}
