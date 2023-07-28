package com.alg.leetcode.map;

import java.util.*;

public class P720 {
    class Solution {
        public String longestWord(String[] words) {
            Set<String> set = new TreeSet<>();
            for(String word:words) {
                set.add(word);
            }
            PriorityQueue<String> pq = new PriorityQueue<String>();

            int maxlen = Integer.MIN_VALUE;
            for(String word:words) {
                if(exits(set,word)) {
                    if(word.length()>maxlen) {
                        pq.clear();
                        maxlen=word.length();
                        pq.offer(word);
                    }
                    else if(word.length()==maxlen) {
                        pq.offer(word);
                    }
                }
            }

            if(pq.size()>0) return pq.peek();
            else return null;
        }

        boolean exits(Set<String> set,String target) {
            if(target.length()>=2)
                return set.contains(target)&&exits(set,target.substring(0,target.length()-1));
            else
                return set.contains(target);
        }
    }

    public static void main(String[] args) {
        Solution solution = new P720().new Solution();
        String [] arr = {"w","wo","wor","worl","world"};
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        boolean b = solution.exits(set,"worl");
        System.out.println(b);
        System.out.println(set);
    }
}
