package com.alg.leetcode.map;

import java.util.HashSet;
import java.util.Set;

public class P202 {
    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> set = new HashSet<>();
            int next = n;
            while (next!=1) {
                if(set.contains(next)) return false;
                set.add(next);
                next = sqrnum(next);
            }

            return true;
        }

        public   int  sqrnum(int n) {
            int ans = 0;
            while (n!=0) {
                ans += (n%10)*(n%10);
                n = n/10;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int n = new P202().new Solution().sqrnum(12);
        System.out.println(n);
    }
}
