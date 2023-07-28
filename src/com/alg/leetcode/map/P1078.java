package com.alg.leetcode.map;

import java.util.ArrayList;
import java.util.List;

public class P1078 {
    class Solution {
        public String[] findOcurrences(String text, String first, String second) {
            String[] arr = text.split(" ");
            List<String> ls_ans = new ArrayList<>();
            for (int i = 0; i < arr.length - 2; i++) {
                String key = arr[i] + arr[i + 1];
                if (key.equals(first + second))
                    ls_ans.add(arr[i + 2]);
            }
            return ls_ans.toArray(new String[ls_ans.size()]);
        }
    }
}
