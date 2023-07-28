package com.alg.leetcode.map;

import java.util.ArrayList;
import java.util.List;

public class P500 {
    class Solution {
        public String[] findWords(String[] words) {
            List<String> list = new ArrayList<>();
            for(String word:words) {
                if(sameline(word.toLowerCase()))
                    list.add(word);
            }
            return list.toArray(new String[list.size()]);
        }

        public boolean sameline(String word) {
            if(word==null||word.length()==0) return false;
            String [] dic = new String[] {"qwertyuiop","asdfghjkl","zxcvbnm"};
            char[] chararray = word.toCharArray();
            for(String item:dic){
                if(item.indexOf(chararray[0])==-1) continue;
                for(char c:chararray) {
                    if(item.indexOf(c)==-1) return false;
                }
            }
            return true;
        }
    }
}
