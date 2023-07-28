package com.alg.leetcode.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P506 {
    class Element {
        int score;
        int index;

        public Element(int score, int index) {
            this.score = score;
            this.index = index;
        }
    }

    class Solution {
        public String[] findRelativeRanks(int[] nums) {
            String[] scores = new String[nums.length];

            PriorityQueue<Element> pq = new PriorityQueue<>(new Comparator<Element>() {
                @Override
                public int compare(Element o1, Element o2) {
                    return o2.score - o1.score;
                }
            });
            for (int i = 0; i < nums.length; i++) {
                pq.offer(new Element(nums[i], i));
            }

            int i = 0;
            while (!pq.isEmpty()) {
                i++;
                Element element = pq.poll();
                scores[element.index] = i + "";
                if (i == 1) scores[element.index] = "Gold Medal";
                if (i == 2) scores[element.index] = "Silver Medal";
                if (i == 3) scores[element.index] = "Bronze Medal";
            }

            return scores;
        }
    }
}
