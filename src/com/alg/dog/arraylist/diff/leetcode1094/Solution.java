package com.alg.dog.arraylist.diff.leetcode1094;

import com.alg.dog.arraylist.diff.DiffArray;

public class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        DiffArray diffArray = new DiffArray(new int[1001]);
        for (int[] trip:trips) {
            diffArray.add(trip[1],trip[2]-1,trip[0]);
        }
        int[] ints = diffArray.generateArray();
        for(int i:ints) {
            if(i>capacity) return false;
        }
        return true;
    }
}
