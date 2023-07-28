package com.alg.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P350 {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int num:nums1) {
                int count = map.getOrDefault(num,0);
                map.put(num,count+1);
            }
            List<Integer> list = new ArrayList<>();
            for(int num:nums2) {
                if(map.getOrDefault(num,0)>0) {
                    list.add(num);
                    map.put(num,map.get(num)-1);
                }
            }
            int[] ans = new int[list.size()];
            for(int i=0;i<ans.length;i++){
                ans[i]=list.get(i);
            }
            return ans;
        }
    }
}
