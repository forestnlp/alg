package com.alg.leetcode.stack;

import java.util.Stack;

public class P394M {
    class Solution {
        public String decodeString(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    stack.push(c);
                } else {
                    if (c == '[' || Character.isLetter(c))
                        stack.push(c);
                    else if (c == ']') {
                        StringBuilder tsb = new StringBuilder();
                        while (stack.peek() != '[')
                            tsb.insert(0, stack.pop());
                        stack.pop();
                        StringBuilder times = new StringBuilder();
                        while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                            times.insert(0,stack.pop());
                        }
                        int t = Integer.parseInt(times.toString());
                        StringBuilder sb = new StringBuilder();
                        for (int k = 0; k < t; k++) {
                            sb.append(tsb);
                        }
                        for (int k = 0; k < sb.length(); k++)
                            stack.push(sb.charAt(k));
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.insert(0, stack.pop());
            }
            return new String(sb);
        }
    }
}
