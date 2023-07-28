package com.alg.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class P804 {
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            Set<String> set = new HashSet<>();
            String [] dictionary = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            for(String word:words) {
                StringBuilder sb = new StringBuilder();
                for(char c :word.toCharArray()) {
                    sb.append(dictionary[c-'a']);
                }
                set.add(sb.toString());
            }
            return set.size();
        }
    }
}
