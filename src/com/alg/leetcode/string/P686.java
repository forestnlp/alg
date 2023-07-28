package com.alg.leetcode.string;

public class P686 {
    class Solution {
        public int repeatedStringMatch(String A, String B) {
            int ans = 0;
            String rA = "";
            while (!rA.contains(B)) {
                if(rA.length()>B.length()+A.length()) return -1;
                rA =rA + A;
                ans++;
            }
            return ans;
        }
    }
}
