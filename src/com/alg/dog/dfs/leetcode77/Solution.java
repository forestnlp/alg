package com.alg.dog.dfs.leetcode77;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtrace(1, n, k);
        return res;
    }

    public void backtrace(int start, int n, int k) {
        if (k == track.size()) {
            res.add(new LinkedList<>(track));
        }
        for (int i = start; i <= n; i++) {
            track.addLast(i);
            backtrace(i+1,n,k);
            track.removeLast();
        }
    }
}