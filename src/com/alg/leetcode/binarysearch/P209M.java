package com.alg.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P209M {
    class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            int ans=Integer.MAX_VALUE;
            List<Integer> sums = new ArrayList<>();
            sums.add(0);
            for(int i=1;i<=nums.length;i++) {
                sums.add(sums.get(i-1)+nums[i-1]);
            }
            System.out.println(sums);
            for(int i=0;i<sums.size();i++) {
                int target = sums.get(i)+s;
                int k = binarySearch(sums.subList(i,sums.size()),target);
                if(k!=-1) {
                    ans = Math.min(ans,k);
                }
            }
            return ans==Integer.MAX_VALUE?0:ans;
        }

        public int binarySearch(List<Integer> list,int target) {
            int l=0,r=list.size()-1;
            while (l<r) {
                int m = l + (r-l)/2;
                if(list.get(m)>=target) {
                    r = m;
                }
                else {
                    l=m+1;
                }
            }
            if(list.get(l)>target) return l;
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P209M().new Solution();
       // int i = solution.minSubArrayLen(7,new int[] {1,3,5});
        int i = solution.binarySearch(Arrays.asList(1,3,6),3);
        System.out.println(i);
    }
}
