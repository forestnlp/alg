package com.alg.leetcode.stack;

import java.util.Stack;

public class P844 {
    class Solution {
        public boolean backspaceCompare(String S, String T) {
            return orignalString(S).equals(orignalString(T));
        }

        public Stack<Character> orignalString(String str) {
            Stack<Character> stack = new Stack<>();
            char[]  strArray = str.toCharArray();
            for(char c:strArray) {
                if(c=='#'){
                    if(!stack.isEmpty())
                    stack.pop();
                }
                else
                    stack.push(c);
            }
            return stack;
        }
    }
}
