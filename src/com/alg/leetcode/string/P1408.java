package com.alg.leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1408 {
    class Solution {
        public List<String> stringMatching(String[] words) {
            Set<String> subStrings = new HashSet<>();
            for(int i=0;i<words.length;i++) {
                for(int k=0;k<words.length;k++) {
                    if(i==k) continue;
                    if(words[k].contains(words[i]))
                        subStrings.add(words[i]);
                }
            }
            return new ArrayList<>(subStrings);
        }
    }
}
