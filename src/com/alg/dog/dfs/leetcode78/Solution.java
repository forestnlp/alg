package com.alg.dog.dfs.leetcode78;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrace(nums, 0);
        return res;
    }

    public void backtrace(int[] nums, int start) {
        res.add(new LinkedList<>(track));

        for (int i = start; i < nums.length; i++) {
            track.addLast(nums[i]);
            backtrace(nums, i + 1);
            track.removeLast();
        }
    }
}