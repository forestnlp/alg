package com.alg.sword.jz30;

import java.util.Stack;

public class Solution {

    Stack<Integer> val_holder = new Stack<>();
    Stack<Integer> min_holder = new Stack<>();

    public void push(int node) {
        int min = min_holder.empty()?Integer.MAX_VALUE:min_holder.peek();
        min_holder.push(Math.min(node, min));
        val_holder.push(node);
    }

    public void pop() {
        min_holder.pop();
        val_holder.pop();
    }

    public int top() {
        return val_holder.peek();
    }

    public int min() {
        return min_holder.peek();
    }
}