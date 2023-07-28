package com.alg.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1331 {
    class Solution {
        public int[] arrayRankTransform(int[] arr) {

            if (arr == null || arr.length == 0) return new int[]{};

            int[] arr2 = arr.clone();

            Arrays.sort(arr2);
            int pm = 1;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr2.length; i++) {
                if (i >= 1) {
                    if (arr2[i] != arr2[i - 1]) pm++;
                    map.put(arr2[i], pm);
                } else {
                    map.put(arr2[i], 1);
                }
            }

            int[] ans = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                ans[i] = map.get(arr[i]);
            }
            return ans;
        }
    }
}
