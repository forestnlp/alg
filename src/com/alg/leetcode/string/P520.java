package com.alg.leetcode.string;

public class P520 {
    class Solution {
        public boolean detectCapitalUse(String word) {
            if(word==null||word.length()==0) return false;
            char[] chars = word.toCharArray();
            boolean firstCap = iscap(chars[0]);
            boolean tailCap = iscap(chars[chars.length-1]);

            if(firstCap) {
                if(tailCap){
                    for(int i=1;i<chars.length;i++) {
                        if(!iscap(chars[i])) return false;
                    }
                }
                else {
                    for(int i=1;i<chars.length;i++) {
                        if(iscap(chars[i])) return false;
                    }
                }
            }
            else {
                for(char c:chars) {
                    if(iscap(c)) return false;
                }
            }
            return true;
        }

        public boolean iscap(char c){
           return c>=65&&c<=90;
        }
    }
}
