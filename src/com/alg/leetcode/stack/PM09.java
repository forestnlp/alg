package com.alg.leetcode.stack;

import java.util.Stack;

public class PM09 {
    class CQueue {
        Stack<Integer> first;
        Stack<Integer> second;
        public CQueue() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void appendTail(int value) {
            first.push(value);
        }

        public int deleteHead() {
            if(second.isEmpty()){
                while (!first.isEmpty()) {
                    second.push(first.pop());
                }
            }
            return second.isEmpty()?-1:second.pop();
        }
    }
}
