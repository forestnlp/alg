package com.alg.leetcode.string;

public class P1332 {

    class Solution {
        public int removePalindromeSub(String s) {
            if(s==null||s.length()==0) return 0;
            if (new StringBuffer(s).reverse().toString().equals(s)) return 1;
            else return 2;
        }
    }

}
