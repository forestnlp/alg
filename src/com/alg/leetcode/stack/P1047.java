package com.alg.leetcode.stack;

import java.util.Stack;

public class P1047 {
    class Solution {
        public String removeDuplicates(String S) {
            Stack<Character> stack = new Stack<>();
            for(char c:S.toCharArray()){
                if(!stack.isEmpty()&&c==stack.peek()){
                    stack.pop();
                }
                else
                    stack.push(c);
            }

            StringBuilder sb = new StringBuilder();
            for(char c:stack){
                sb.append(c);
            }
            return sb.toString();
        }
    }
}

