package com.alg.leetcode.bit;

public class P1342 {
    class Solution {
        public int numberOfSteps (int num) {
            int cnt=0;

            while (num!=0) {
                if((num&1)==0) num>>=1;
                else num--;
                cnt++;
            }
            return cnt;
        }
    }
}
