package com.alg.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

public class P225 {
    class MyStack {

        Queue<Integer> queEmpty;
        Queue<Integer> queFilled;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            queEmpty = new LinkedList<>();
            queFilled = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            reAssign();
            queFilled.offer(x);
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            reAssign();
            int size = queFilled.size();
            while (size > 1) {
                queEmpty.offer(queFilled.poll());
                size--;
            }
            return queFilled.poll();
        }

        /**
         * Get the top element.
         */
        public int top() {
            reAssign();
            int size = queFilled.size();
            while (size > 1) {
                queEmpty.offer(queFilled.poll());
                size--;
            }
            int rtn = queFilled.poll();
            queEmpty.offer(rtn);
            return rtn;
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return queFilled.isEmpty()&&queEmpty.isEmpty();
        }

        private void reAssign() {
            if (queEmpty.isEmpty()) return;
            Queue<Integer> tmp = queEmpty;
            queEmpty = queFilled;
            queFilled = tmp;
        }
    }

    public static void main(String[] args) {
        MyStack stack = new P225().new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
