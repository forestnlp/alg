package com.alg.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            for(int num:nums1) {
                set.add(num);
            }

            Set<Integer> set2 = new HashSet<>();
            for(int num:nums2) {
                if(set.contains(num)) set2.add(num);
            }

            int[] ans = new int[set2.size()];
            Object[] oArray = set2.toArray();
            for(int i=0;i<oArray.length;i++) {
                ans[i] = (int)oArray[i];
            }
            return ans;
        }
    }
}
