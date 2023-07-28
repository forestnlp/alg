package com.alg.leetcode.array;

public class P1160 {
    class Solution {
        public int countCharacters(String[] words, String chars) {
            int[] memo = new int[26];
            for(char c:chars.toCharArray()) {
                memo[c-'a']++;
            }

            int total = 0;

            for(String word:words) {
                int [] temp = memo.clone();
                boolean flag=true;
                for(char c:word.toCharArray()) {
                    temp[c-'a']--;
                    if(temp[c-'a']<0) {
                        flag=false;
                    }
                }
                if(flag) total+=word.length();
            }

            return total;
        }
    }
}
