package com.alg.leetcode.twopointers;


public class P28 {
    class Solution {
        public int strStr(String haystack, String needle) {
            int i=0,k=0;
            if(needle.equals("")) return 0;
            while (i<haystack.length()-needle.length()+1) {
                if(haystack.charAt(i)==needle.charAt(k)&&k<needle.length()) {
                    if(k==needle.length()-1) return i-k;
                    else k++;
                }
                else {
                    i=i-k;
                    k=0;
                }
                i++;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P28().new Solution();
        int index = solution.strStr("mississippi","issip");
        System.out.println(index);
    }
}
