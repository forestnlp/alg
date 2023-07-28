package com.alg.leetcode.sort;

import java.util.Arrays;

public class P1288 {

    class Solution {
        public int removeCoveredIntervals(int[][] intervals) {
            Arrays.sort(intervals,(a, b) -> {
                if(a[0]==b[0])
                    return b[1]-a[1];
                return a[0]-b[0];
            });

            int ans = 0;
            int leftmost = intervals[0][0];
            int rightmost = intervals[0][1];
            for(int i=1;i<intervals.length;i++){
                int[] ints = intervals[i];
                int curleft = ints[0];
                int curright = ints[1];
                //覆盖
                if(leftmost<=curleft&&rightmost>=curright)
                    ans++;
                if(rightmost>=curleft&&rightmost<=curright)
                    rightmost = curright;
                if(rightmost<=curleft){
                    leftmost = curleft;
                    rightmost = curright;
                }
            }
            return intervals.length-ans;
        }
    }
}
