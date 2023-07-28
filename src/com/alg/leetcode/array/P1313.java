package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class P1313 {
    class Solution {
        public int[] decompressRLElist(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i += 2) {
                int times = nums[i];
                int num = nums[i + 1];
                while (times > 0) {
                    list.add(num);
                    times--;
                }
            }
            int[] ans = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ans[i] = list.get(i);
            }
            return ans;
        }
    }
}
