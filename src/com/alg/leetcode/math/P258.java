package com.alg.leetcode.math;

public class P258 {
    class Solution {
        public int addDigits(int num) {
            int n= num;
            int res = 0;
            while (n!=0) {
                res +=n%10;
                n/=10;
            }
            if(res>=10) return addDigits(res);
            else return res;
        }
    }
}
