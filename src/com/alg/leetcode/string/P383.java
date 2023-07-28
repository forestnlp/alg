package com.alg.leetcode.string;

public class P383 {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int [] buckets = new int[26];
            for(char c:magazine.toCharArray()) {
                buckets[c-'a'] ++;
            }
            for(char c:ransomNote.toCharArray()) {
                buckets[c-'a']--;
                if(buckets[c-'a']<0) return false;
            }
            return true;
        }
    }
}
