package com.alg.leetcode.string;

public class P1455 {
    class Solution {
        public int isPrefixOfWord(String sentence, String searchWord) {
            String [] words = sentence.split("\\s");
            int i=1;
            for(String word:words) {
                if(word.startsWith(searchWord)) return i;
                i++;
            }
            return -1;
        }
    }
}
