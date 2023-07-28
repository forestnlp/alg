package com.alg.leetcode.array;

import java.util.PriorityQueue;

public class P747 {
    class Solution {
        public int dominantIndex(int[] nums) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for(int i=0;i<nums.length;i++) {
                int n = nums[i]*100+i;
                if(queue.size()<2) queue.offer(n);
                else if(queue.peek()<n) {
                    queue.poll();
                    queue.offer(n);
                }
            }

            if(queue.size()<2) return 0;

            int e1 = queue.poll();
            int e2 = queue.poll();

            if(e2/100>=(e1/100)*2)
                return e2%100;
            return -1;
        }
    }
}
