package com.alg.leetcode.math;

import java.util.ArrayList;
import java.util.List;

public class P728 {
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> ans = new ArrayList<>();
            while (left<=right) {
                if(isselfdivided(left))
                    ans.add(left);
                left++;
            }
            return ans;
        }

        public boolean isselfdivided(int num) {
            int n = num;
            while (n!=0) {
                int i = n%10;
                if(i==0) return false;
                if(num%i!=0) return false;
                n/=10;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        boolean b = new P728().new Solution().isselfdivided(11);
        System.out.println(b);
    }
}
