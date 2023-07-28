package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class P1018 {
    class Solution {
        public List<Boolean> prefixesDivBy5(int[] A) {
            int num = 0;
            List<Boolean> ans = new ArrayList<>();
            for(int n:A) {
                num = num*2+n;
                num = num%5;
                if(num==0)
                    ans.add(true);
                else
                    ans.add(false);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P1018().new Solution();
        List<Boolean> ans = solution.prefixesDivBy5(new int[]{0,1,1});
        System.out.println(ans);
    }
}
