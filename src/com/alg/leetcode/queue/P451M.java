package com.alg.leetcode.queue;

import java.util.*;

public class P451M {
    class Solution {
        public String frequencySort(String s) {

            PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
                @Override
                public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                    return o2.getValue()-o1.getValue();
                }
            });

            Map<Character,Integer> map = new HashMap<>();
            StringBuilder sb = new StringBuilder();

            for(int i=0;i<s.length();i++) {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }

            for(Map.Entry<Character,Integer> entry:map.entrySet())
                pq.offer(entry);

            while (!pq.isEmpty()) {
                Map.Entry<Character,Integer> e = pq.poll();
                int t = e.getValue();
                char c = e.getKey();
                while (t>0) {
                    sb.append(c);
                    t--;
                }
            }

            return sb.toString();
        }
    }

}
