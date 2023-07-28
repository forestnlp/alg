package com.alg.leetcode.string;

public class P551 {
    class Solution {
        public boolean checkRecord(String s) {
            for(int i=2;i<s.length();i++) {
                if(s.charAt(i)=='L'&&s.charAt(i-1)=='L'&&s.charAt(i-2)=='L') return false;
            }
            if(s.indexOf('A')!=s.lastIndexOf('A')) return false;
            return true;
        }
    }
}
