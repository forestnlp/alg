package com.alg.leetcode.array;

public class PM0101 {
    class Solution {
        public boolean isUnique(String astr) {
            int[] buckets = new int[26];
            for(char c:astr.toCharArray()) {
                buckets[c-'a'] +=1;
                if(buckets[c-'a']>1) return false;
            }
            return true;
        }
    }
}
