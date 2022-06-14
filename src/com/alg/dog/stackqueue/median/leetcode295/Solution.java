package com.alg.dog.stackqueue.median.leetcode295;

import java.util.PriorityQueue;

public class Solution {
    class MedianFinder {

        PriorityQueue<Integer> small;
        PriorityQueue<Integer> large;

        public MedianFinder() {
            large = new PriorityQueue<>();
            small = new PriorityQueue<>((a, b) -> {
                return b - a;
            });
        }

        public void addNum(int num) {
            if (small.size() >= large.size()) {
                small.offer(num);
                large.offer(small.poll());
            } else {
                large.offer(num);
                small.offer(large.poll());
            }
        }

        public double findMedian() {
            if (large.size() < small.size()) {
                return small.peek();
            } else if (large.size() > small.size()) {
                return large.peek();
            }
            // 如果元素一样多，两个堆堆顶元素的平均数是中位数
            return (large.peek() + small.peek()) / 2.0;
        }
    }
}
