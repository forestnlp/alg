package com.alg.leetcode.string;

public class P58 {
    class Solution {
        public int lengthOfLastWord(String s) {
            int start = 0;
            int end = s.length()-1;
            while (end>=0&&s.charAt(end)==' ') end--;
            start = end;
            while (start>=0&&s.charAt(start)!=' ') start--;
            return end-start;
        }
    }
}
