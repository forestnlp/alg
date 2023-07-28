package com.alg.leetcode.stack;

import java.util.Stack;

public class PM0302 {
    class MinStack {

        /** initialize your data structure here. */

        Stack<Integer> stack;
        Stack<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            if(minStack.isEmpty()||x<=minStack.peek())
                minStack.push(x);
            stack.push(x);
        }

        public void pop() {
            int x = stack.pop();
            if(!minStack.isEmpty()&&x==minStack.peek())
                minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
