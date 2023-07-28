package com.alg.leetcode.string;

public class P1556 {
    class Solution {
        public String thousandSeparator(int n) {
            String str = String.valueOf(n);
            int len = str.length();
            if(len<=3) return str;
            StringBuilder sb = new StringBuilder();
            while (len>3){
                sb.insert(0,str.substring(len-3,len));
                sb.insert(0,'.');
                len -=3;
            }
            if(len>0) sb.insert(0,str.substring(0,len));
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String ans = new P1556().new Solution().thousandSeparator(12345678);
        System.out.println(ans);
    }
}
