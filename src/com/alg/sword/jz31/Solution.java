package com.alg.sword.jz31;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int j =0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty()&&popA[j]==stack.peek()) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().IsPopOrder(new int[]{1,2,3,4,5},new int[]{4,5,3,1,2}));
    }
}