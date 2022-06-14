package com.alg.dog.stackqueue.leetcode316;

import java.util.Stack;

public class Solution {

    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int [] counter = new int[256];
        for (char c : s.toCharArray()) {
            counter[c]++;
        }

        boolean[] instack = new boolean[256];
        for (char c : s.toCharArray()){
            counter[c]--;
            //if the stack contains the element , skip it;
            if(instack[c]) continue;
            while (!stack.isEmpty()&&stack.peek()>c){
                //if the top element is no longer exists in the nexe sequence,do not pop
                if(counter[stack.peek()]==0){
                    break;
                }
                //pop the duplicate element
                instack[stack.pop()]=false;
            }
            instack[c] = true;
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String bcac = new Solution().removeDuplicateLetters("bcac");
        System.out.println(bcac);
    }
}
