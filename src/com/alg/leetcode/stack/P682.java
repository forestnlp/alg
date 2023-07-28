package com.alg.leetcode.stack;

import java.util.Stack;

public class P682 {
    class Solution {
        public int calPoints(String[] ops) {
            Stack<Integer> stack = new Stack<>();
            for (String s : ops) {
                int res;
                if (s.equals("+")) {
                    int a = stack.pop();
                    int b = stack.peek();
                    res = a+b;
                    stack.push(a);
                    stack.push(res);
                } else if (s.equals("C")) {
                    stack.pop();
                } else if (s.equals("D")) {
                    res = stack.peek() * 2;
                    stack.push(res);
                } else {
                    stack.push(Integer.parseInt(s));
                }
            }
            int points = 0;
            for (int i : stack) {
                points += i;
            }
            return points;
        }
    }
}
