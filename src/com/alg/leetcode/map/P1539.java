package com.alg.leetcode.map;

import java.util.ArrayList;
import java.util.List;

public class P1539 {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            List<Integer> ls  = new ArrayList<>();
            for(int a:arr) {
                ls.add(a);
            }
            int ans=0;
            while (k>0) {
                ans++;
                if(!ls.contains(ans))
                    k--;
            }
            return ans;
        }
    }
}
