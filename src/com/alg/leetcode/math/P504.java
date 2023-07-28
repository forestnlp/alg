package com.alg.leetcode.math;

public class P504 {
    static class Solution {
        public String convertToBase7(int num) {
            if(num==0) return "0";
            boolean  neg = (num<0);
            if(num<0) {
                num*=-1;
            }
            StringBuffer sb = new StringBuffer();
            while (num!=0){
                 int k = num%7;
                 sb.insert(0,k);
                 num/=7;
            }
            if(neg) sb.insert(0,'-');
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String str = new Solution().convertToBase7(-7);
        System.out.println(str);
    }
}
