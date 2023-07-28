package com.alg.leetcode.map;

import java.util.HashSet;
import java.util.Set;

public class P575 {
    class Solution {
        public int distributeCandies(int[] candies) {
            Set<Integer> set = new HashSet<>();
            for(int cd:candies) {
                set.add(cd);
            }
            return Math.min(set.size(),candies.length/2);
        }
    }
}
