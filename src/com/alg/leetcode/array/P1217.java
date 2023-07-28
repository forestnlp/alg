package com.alg.leetcode.array;

public class P1217 {
    class Solution {
        public int minCostToMoveChips(int[] chips) {
            int odd=0,even=0;
            for(int i=0;i<chips.length;i++) {
                if(chips[i]%2==0)
                    even++;
                else
                    odd++;
            }
            return Math.min(even,odd);
        }
    }
}
