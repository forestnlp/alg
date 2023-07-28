package com.alg.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class P219 {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<nums.length;i++) {
                if(set.contains(nums[i]))
                    return true;
                set.add(nums[i]);
                if(set.size()>k){
                    set.remove(nums[i-k]);
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P219().new Solution();
        boolean b = solution.containsNearbyDuplicate(new int[]{4,1,2,3,1,5},3);
        System.out.println(b);
    }
}
