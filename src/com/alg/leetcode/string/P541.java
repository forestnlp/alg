package com.alg.leetcode.string;

public class P541 {
    class Solution {
        public String reverseStr(String s, int k) {
            char[] chars = s.toCharArray();
            int i;
            for (i = 0; i < chars.length; i += 2 * k) {
                int start = i;
                int end = Math.min(i + k - 1,chars.length-1);
                while (start < end) {
                    char tmp = chars[start];
                    chars[start] = chars[end];
                    chars[end] = tmp;
                    start++;
                    end--;
                }
            }
            return new String(chars);
        }
    }

    public static void main(String[] args) {
        Solution solution = new P541().new Solution();
        String res = solution.reverseStr("abcdefg",2);
        System.out.println(res);
    }
}
