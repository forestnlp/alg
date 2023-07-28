package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class P1389 {
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < index.length; i++) {
                list.add(index[i], nums[i]);
            }
            int[] ans = new int[list.size()];
            for (int i = 0; i < ans.length; i++) {
                ans[i] = list.get(i);
            }
            return ans;
        }
    }
}
