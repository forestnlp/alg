package com.alg.offer.stack.sortbyhelper;

import java.util.Stack;

public class Solution {

    public static void sortStackByHelper(Stack<Integer> stack){
        Stack<Integer> helper = new Stack<>();
        while (!stack.isEmpty()){
            int cur = stack.pop();
            if (helper.isEmpty()||cur<=helper.peek()){
                helper.push(cur);
            }
            else {
                while (!helper.isEmpty()){
                    stack.push(helper.pop());
                }
                helper.push(cur);
            }
        }
        while (!helper.isEmpty()){
            stack.push(helper.pop());
        }
    }

    public static void main(String[] args) {
        int[] arrays = {3,1,5,2,6,3,5,6,7,9,1,12,3,5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arrays.length; i++) {
            stack.push(arrays[i]);
        }
        Solution.sortStackByHelper(stack);
        System.out.println(stack);
    }
}
