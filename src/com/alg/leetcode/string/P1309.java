package com.alg.leetcode.string;

public class P1309 {
    class Solution {
        public String freqAlphabets(String s) {
            if (s == null || s.length() == 0) return "";
            int i = 0, num = 0;
            StringBuffer sb = new StringBuffer();
            while (i < s.length())
                if ((s.charAt(i) == '1' || s.charAt(i) == '2') && (i < s.length() - 2 && s.charAt(i + 2) == '#')) {
                    num = Integer.parseInt(s.substring(i, i + 2));
                    sb.append((char) (num + 97));
                    i += 3;
                } else {
                    num = Integer.parseInt(s.substring(i, i + 1));
                    sb.append((char) (num + 97));
                    i += 1;
                }
            return sb.toString();
        }
    }
}
