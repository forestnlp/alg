package com.alg.offer.stack.minstack;

import java.util.Stack;

public class Solution {
    class MinStack2 {

        private Stack<Integer> s;
        private Stack<Integer> mins;

        /**
         * initialize your data structure here.
         */
        public MinStack2() {
            s = new Stack<Integer>();
            mins = new Stack<Integer>();
        }

        public void push(int x) {
            s.push(x);
            if (mins.isEmpty() || mins.peek() >= x) {
                mins.push(x);
            }
        }

        public void pop() {
            int e = s.pop();
            if (e == mins.peek()) {
                mins.pop();
            }
        }

        public int top() {
            return s.peek();
        }

        public int getMin() {
            return mins.peek();
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

    class MinStack {

        private Stack<Integer> s;
        private Stack<Integer> mins;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            s = new Stack<Integer>();
            mins = new Stack<Integer>();
        }

        public void push(int x) {
            s.push(x);
            if (mins.isEmpty() || mins.peek() >= x) {
                mins.push(x);
            }
        }

        public void pop() {
            int e = s.pop();
            if (e == mins.peek()) {
                mins.pop();
            }
        }

        public int top() {
            return s.peek();
        }

        public int getMin() {
            return mins.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

}
