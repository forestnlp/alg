package com.alg.leetcode.stack;

import java.util.Stack;

public class PM0304 {
    class MyQueue {
        Stack<Integer> s1;
        Stack<Integer> s2;
        /** Initialize your data structure here. */
        public MyQueue() {
            s1=new Stack<>();
            s2=new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            s1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(s2.isEmpty()) {
                while(!s1.isEmpty())
                    s2.push(s1.pop());
            }
            if(!s2.isEmpty())
                return s2.pop();
            return -1;
        }

        /** Get the front element. */
        public int peek() {
            if(s2.isEmpty()) {
                while(!s1.isEmpty())
                    s2.push(s1.pop());
            }
            if(!s2.isEmpty())
                return s2.peek();
            return -1;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return s2.isEmpty()&&s1.isEmpty();
        }
    }
}
