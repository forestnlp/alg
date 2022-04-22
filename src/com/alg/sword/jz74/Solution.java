package com.alg.sword.jz74;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int right = 2;
        int left = 1;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while (left < right) {
            int cursum = (left + right) * (right - left + 1) / 2;
            if (cursum == sum) {
                ArrayList<Integer> ans0 = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    ans0.add(i);
                }
                ans.add(ans0);
                left++;
            } else if (cursum > sum) {
                left++;
            } else {
                right++;
            }
        }
        return ans;
    }


}