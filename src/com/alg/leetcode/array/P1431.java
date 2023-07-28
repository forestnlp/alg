package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class P1431 {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> ans = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for(int n:candies) {
                max = Math.max(n,max);
            }
            for(int n:candies){
                if(n+extraCandies>=max)
                    ans.add(true);
                else
                    ans.add(false);
            }
            return ans;
        }
    }
}
