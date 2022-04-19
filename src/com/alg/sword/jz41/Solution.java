package com.alg.sword.jz41;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    PriorityQueue<Double> fengwei = new PriorityQueue<>();
    PriorityQueue<Double> jitou = new PriorityQueue<>(new Comparator<Double>() {
        @Override
        public int compare(Double o1, Double o2) {
            return o2.compareTo(o1);
        }
    });

    public void Insert(Integer num) {
        int size1 = jitou.size();
        int size2 = fengwei.size();

        if (jitou.isEmpty() || num < jitou.peek()) {
            jitou.offer((double) num);
        } else {
            fengwei.offer((double) num);
        }

        PriorityQueue<Double> big = size1 > size2 ? jitou : fengwei;
        PriorityQueue<Double> small = size1 > size2 ? fengwei : jitou;

        while (big.size() - small.size() > 1) {
            small.offer(big.poll());
        }

    }

    public Double GetMedian() {
        int size1 = jitou.size();
        int size2 = fengwei.size();
        if ((size1 + size2) % 2 == 0) {
            double a = jitou.isEmpty() ? 0 : jitou.peek();
            double b = fengwei.isEmpty() ? 0 : fengwei.peek();
            return (a + b) / 2;
        } else {
            if (size1>size2)
                return jitou.peek();
            else
                return fengwei.peek();
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 1, 6, 7, 0, 8};
        Solution solution = new Solution();
        for (int a : arr) {
            solution.Insert(a);
            System.out.print("jitou:" + solution.jitou + " fengwei:" + solution.fengwei);
            System.out.println(solution.GetMedian());
        }
    }

}