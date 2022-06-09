package com.alg.dog.stackqueue.leetcode921;

public class Solution {
    public int minAddToMakeValid(String s) {
        int left = 0, right = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                right++;
            } else if (c == ')') {
                right--;
                if (right == -1) {
                    right = 0;
                    left++;
                }
            }
        }
        return left + right;
    }
}
