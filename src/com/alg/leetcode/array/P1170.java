package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1170 {
    class Solution {
        public int[] numSmallerByFrequency(String[] queries, String[] words) {

            List<Integer> words_occur = new ArrayList<>();
            for(String word:words) {
                int occur = 0;
                char minc=Character.MAX_VALUE;
                for(char c:word.toCharArray()) {
                    if(c<minc) {
                        occur=1;
                        minc = c;
                    }
                    else if(c==minc){
                        occur++;
                    }
                }
                words_occur.add(occur);
            }
            Collections.sort(words_occur);

            int [] ans = new int[queries.length];
            int i  = 0;
            for(String query:queries) {
                int occur = 0;
                char minc=Character.MAX_VALUE;
                for(char c:query.toCharArray()) {
                    if(c<minc) {
                        occur=1;
                        minc = c;
                    }
                    else if(c==minc){
                        occur++;
                    }
                }
                int k = 0;
                for(k=0;k<words_occur.size();k++) {
                    if(words_occur.get(k)>occur)
                        break;
                }
                ans[i] = words_occur.size()-k;
                i++;
            }

            return ans;
        }
    }
}
