package com.alg.leetcode.string;

public class P917 {
    class Solution {
        public String reverseOnlyLetters(String S) {
            int left = 0, right = S.length() - 1;
            char[] chars = S.toCharArray();
            while (left<right) {
                while (left<S.length()-1&&!Character.isLetter(chars[left])) left++;
                while (right>0&&!Character.isLetter(chars[right])) right--;
                if(left<right) {
                    char c = chars[left];
                    chars[left] = chars[right];
                    chars[right] = c;
                }
                left++;
                right--;
            }
            return new String(chars);
        }
    }
}
