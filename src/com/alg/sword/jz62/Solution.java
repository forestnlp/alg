package com.alg.sword.jz62;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        Deque<Integer> circle = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            circle.add(i);
        }
        int index = 0;
        while (circle.size() > 1) {
            index = (index - 1 + m) % circle.size();
            circle.remove(index);
        }
        return circle.peek();
    }
}