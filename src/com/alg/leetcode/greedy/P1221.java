package com.alg.leetcode.greedy;

public class P1221 {
    class Solution {
        public int balancedStringSplit(String s) {
            int ans = 0;
            int num = 0;
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i)=='L') num++;
                else if(s.charAt(i)=='R') num--;
                if(num==0) ans++;
            }
            return ans;
        }
    }
}
