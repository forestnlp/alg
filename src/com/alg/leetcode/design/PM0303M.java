package com.alg.leetcode.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PM0303M {
    class StackOfPlates {

        List<Stack<Integer>> stacks;
        int currentStack = 0;
        int cap;

        public StackOfPlates(int cap) {
            stacks = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            stacks.add(stack);
            this.cap = cap;
        }

        public void push(int val) {
            if(cap<=0) return;
            Stack<Integer> stack;
            if(currentStack>=0)
                 stack = stacks.get(currentStack);
            else {
                stack = new Stack<>();
                stacks.add(stack);
                currentStack = 0;
            }
            if(stack.size()==cap){
                stack = new Stack<>();
                stacks.add(stack);
                currentStack++;
            }
            stack.push(val);
        }

        public int pop() {
            return popAt(currentStack);
        }

        public int popAt(int index) {
            if(index<0||index>=stacks.size()) return -1;
            Stack<Integer> stack = stacks.get(index);
            if(stack.isEmpty()) return -1;
            int val = stack.pop();
            if(stack.isEmpty()) {
                stacks.remove(index);
                currentStack--;
            }
            return val;
        }
    }

    /**
     * Your StackOfPlates object will be instantiated and called as such:
     * StackOfPlates obj = new StackOfPlates(cap);
     * obj.push(val);
     * int param_2 = obj.pop();
     * int param_3 = obj.popAt(index);
     */
}
