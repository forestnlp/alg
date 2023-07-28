package com.alg.leetcode.string;

public class PM58I {
    class Solution {
        public String reverseWords(String s) {
            String [] array = s.trim().split("\\s");
            StringBuffer sb = new StringBuffer();
            for(int i=array.length-1;i>=0;i--) {
                if(array[i].trim().equals("")) continue;
                sb.append(array[i]);
                if(i>=1) sb.append(" ");
            }
            return sb.toString();
        }
    }
}
