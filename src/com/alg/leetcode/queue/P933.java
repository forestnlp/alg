package com.alg.leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class P933 {
    class RecentCounter {

        Queue<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {

            queue.offer(t);

            while (t-queue.peek()>3000) queue.poll();

            return queue.size();
        }
    }
}
