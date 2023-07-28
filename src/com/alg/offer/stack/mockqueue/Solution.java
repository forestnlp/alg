package com.alg.offer.stack.mockqueue;

import java.util.Stack;

public class Solution {
    class MyQueue {

        private Stack<Integer> s_in;
        private Stack<Integer> s_out;

        /** Initialize your data structure here. */
        public MyQueue() {
            s_in = new Stack<Integer>();
            s_out = new Stack<Integer>();
        }

        private void transfer(){
            if(s_out.isEmpty()){
                while(!s_in.isEmpty()){
                    s_out.push(s_in.pop());
                }
            }
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            s_in.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            transfer();
            int x = s_out.pop();
            return x;
        }

        /** Get the front element. */
        public int peek() {
            transfer();
            return s_out.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return s_in.isEmpty()&&s_out.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

}
