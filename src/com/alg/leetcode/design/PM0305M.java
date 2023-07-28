package com.alg.leetcode.design;

import java.util.Stack;

public class PM0305M {
    class SortedStack {

        Stack<Integer> sortedStack;
        Stack<Integer> helperStack;

        public SortedStack() {
            sortedStack = new Stack<>();
            helperStack = new Stack<>();
        }

        public void push(int val) {
            while (!sortedStack.isEmpty()&&val<sortedStack.peek()){
                helperStack.push(sortedStack.pop());
            }
            sortedStack.push(val);
            while (!helperStack.isEmpty())
                sortedStack.push(helperStack.pop());
        }

        public void pop() {
            if(sortedStack.isEmpty()) return;
            sortedStack.pop();
        }

        public int peek() {
            if(sortedStack.isEmpty()) return -1;
            return sortedStack.peek();
        }

        public boolean isEmpty() {
            return sortedStack.isEmpty();
        }
    }
}
