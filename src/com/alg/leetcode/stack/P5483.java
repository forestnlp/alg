package com.alg.leetcode.stack;

import java.util.Stack;

public class P5483 {
    class Solution {
        public String makeGood(String s) {
            char[] arr = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<arr.length;i++){
                char c = arr[i];
                if(!stack.isEmpty()) {
                    if(stack.peek()+32==c||stack.peek()-32==c) stack.pop();
                    else stack.push(c);
                }
                else
                    stack.push(c);
            }
            StringBuffer sb = new StringBuffer();
            for(char c:stack) {
                sb.append(c);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println((int)'a');
        System.out.println((int)'A');
    }
}

