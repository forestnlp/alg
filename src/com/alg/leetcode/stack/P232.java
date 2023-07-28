package com.alg.leetcode.stack;

import java.util.Stack;

public class P232 {

    class MyQueue {
        Stack<Integer> firstStack;
        Stack<Integer> secondStack;

        /** Initialize your data structure here. */
        public MyQueue() {
            firstStack = new Stack<>();
            secondStack = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            secondStack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(firstStack.isEmpty()){
                while (!secondStack.isEmpty())
                    firstStack.push(secondStack.pop());
            }
            return firstStack.pop();
        }

        /** Get the front element. */
        public int peek() {
            if(firstStack.isEmpty()){
                while (!secondStack.isEmpty())
                    firstStack.push(secondStack.pop());
            }
            return firstStack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return firstStack.isEmpty()&&secondStack.isEmpty();
        }
    }
}
