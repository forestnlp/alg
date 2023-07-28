package com.alg.leetcode.stack;

import java.util.Stack;

public class P150M {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for (String token : tokens) {
                if (("+-*/").contains(token)) {
                    int m1 = stack.pop();
                    int m2 = stack.pop();
                    switch (token) {
                        case "+":
                            stack.push(m1+m2);
                            break;
                        case "-":
                            stack.push(m2-m1);
                            break;
                        case "*":
                            stack.push(m1*m2);
                            break;
                        case "/":
                            stack.push(m2/m1);
                            break;
                        default:
                            break;
                    }
                }
                else
                    stack.push(Integer.parseInt(token));
            }
            return stack.peek();
        }
    }
}
