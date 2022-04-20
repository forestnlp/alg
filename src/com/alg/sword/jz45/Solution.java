package com.alg.sword.jz45;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (String.valueOf(o1)+String.valueOf(o2)).compareTo(String.valueOf(o2)+String.valueOf(o1));
            }
        });
        for (int n :
                numbers) {
            priorityQueue.offer(n);
        }
        StringBuilder sb = new StringBuilder();
        while (!priorityQueue.isEmpty())
            sb.append(priorityQueue.poll());
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().PrintMinNumber(new int[]{12,23,45,11}));;
    }
}