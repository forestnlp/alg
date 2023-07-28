package com.alg.leetcode.twopointers;

public class P345 {
    class Solution {
        public String reverseVowels(String s) {
            String vowels = "aeiou";
            int left = 0, right = s.length() - 1;
            char[] carray = s.toCharArray();

            while (left <= right) {
                while (left < s.length() && vowels.indexOf(Character.toLowerCase(carray[left])) == -1)
                    left++;
                while (right >= 0 && vowels.indexOf(Character.toLowerCase(carray[right])) == -1)
                    right--;
                if (left <= right) {
                    char c = carray[left];
                    carray[left] = carray[right];
                    carray[right] = c;
                    left++;
                    right--;
                }
            }
            return new String(carray);
        }
    }

    public static void main(String[] args) {
        Solution solution = new P345().new Solution();
        solution.reverseVowels("hello");
    }
}
