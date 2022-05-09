package com.alg.dog.arraylist.diff.leetcode1109;

import com.alg.dog.arraylist.diff.DiffArray;

import java.util.Arrays;

public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums = new int[n];
        DiffArray diffArray = new DiffArray(nums);
        for (int[] record : bookings) {
            diffArray.add(record[0] - 1, record[1] - 1, record[2]);
        }
        return diffArray.generateArray();
    }

    public static void main(String[] args) {
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] ints = new Solution().corpFlightBookings(bookings, 5);
        System.out.printf("ints=" + Arrays.toString(ints));
    }
}
