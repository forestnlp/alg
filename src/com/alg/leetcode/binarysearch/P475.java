package com.alg.leetcode.binarysearch;

import java.util.*;

public class P475 {
    class Solution {
        public int findRadius(int[] houses, int[] heaters) {
            Arrays.sort(heaters);
            Arrays.sort(houses);
            if(houses[0]>heaters[heaters.length-1]) return houses[houses.length-1]-heaters[heaters.length-1];
            if(houses[houses.length-1]<heaters[0]) return heaters[0]-houses[0];
            int max = Integer.MIN_VALUE;
            for(int i=0;i<houses.length;i++) {
                //计算距离heaters的最小距离
                int min = helper(heaters,houses[i]);
                if(min>max) max = min;
            }
            return max;
        }

        public int helper(int[] heaters,int house) {
            int dis = Integer.MAX_VALUE;
            for(int i=0;i<heaters.length;i++) {
                int curdis = Math.abs(house-heaters[i]);
                if(curdis<dis) dis=curdis;
            }
            return dis;

            //return binarySearch(heaters,house);
        }
    }

    public static void main(String[] args) {
        Solution solution = new P475().new Solution();
        int r = solution.findRadius(new int[]{1,2,3,4}, new int[]{1,4});
        System.out.println(r);
    }
}
