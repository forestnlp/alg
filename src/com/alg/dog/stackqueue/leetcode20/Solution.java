package com.alg.dog.stackqueue.leetcode20;

import java.util.ArrayDeque;

public class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }
            else {
                char d = getpair(c);
                if(!stack.isEmpty()&&stack.peek()==d) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

    public char getpair(char c){
        if(c==')') return '(';
        else if(c==']') return '[';
        else return '{';
    }
}
