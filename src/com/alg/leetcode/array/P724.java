package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class P724 {
    class Solution {
        public int pivotIndex(int[] nums) {
            if(nums==null||nums.length==0) return -1;
            List<Integer> acclist = new ArrayList<>();
            acclist.add(nums[0]);
            for(int i=1;i<nums.length;i++){
                acclist.add(nums[i]+acclist.get(i-1));
            }
            int totalsum = acclist.get(acclist.size()-1);
            for(int i=0;i<acclist.size();i++) {
                if((acclist.get(i)-nums[i])*2==(totalsum-nums[i]))
                    return i;
            }
            return -1;
        }
    }
}
