package com.alg.leetcode.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PM59 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if(nums==null||nums.length==0) return new int[0];
            PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });

            int[] ans = new int[nums.length-k+1];

            for(int i=0;i<k;i++) {
                pq.offer(nums[i]);
            }
            ans[0] = pq.peek();

            int idx = 1;
            for(int i=k;i<nums.length;i++) {
                pq.remove(nums[i-k]);
                pq.offer(nums[i]);
                ans[idx] = pq.peek();
                idx++;
            }

            return ans;
        }
    }
}
