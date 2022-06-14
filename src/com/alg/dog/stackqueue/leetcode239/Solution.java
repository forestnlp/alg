package com.alg.dog.stackqueue.leetcode239;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    class MyQueue {

        LinkedList<Integer> maxq = new LinkedList<>();

        public void push(int val) {
            while (!maxq.isEmpty() && maxq.getLast() < val) {
                maxq.pollLast();
            }
            maxq.addLast(val);
        }

        public void pop(int val) {
            if (val == maxq.getFirst())
                maxq.pollFirst();
        }

        public int max() {
            return maxq.getFirst();
        }
    }


    public int[] maxSlidingWindow(int[] nums, int k) {
        MyQueue window = new MyQueue();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i < k - 1) {
                window.push(nums[i]);
            } else {
                window.push(nums[i]);
                ans.add(window.max());
                window.pop(nums[i - k + 1]);
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
