package com.alg.leetcode.array;

import java.util.*;

public class P1200 {
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            List<List<Integer>> ans = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            for(int i=1;i<arr.length;i++) {
                int temp = arr[i]-arr[i-1];
                if(temp<min) {
                    min = temp;
                    ans.clear();
                    ans.add(Arrays.asList(arr[i-1],arr[i]));
                }
                else if(temp==min) {
                    ans.add(Arrays.asList(arr[i-1],arr[i]));
                }
            }
            return ans;
        }
    }
}
