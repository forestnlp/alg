package com.alg.leetcode.array;

import java.util.TreeSet;

public class P414 {
    class Solution {
        public int thirdMax(int[] nums) {
            TreeSet<Integer> set = new TreeSet<>();
            for(int n:nums){
                set.add(n);
            }
            if(set.size()>=3) {
                set.pollLast();
                set.pollLast();
                return set.pollLast();
            }
            else
                return set.pollLast();
        }
    }
}
