package com.alg.leetcode.string;

public class P482 {
    static class Solution {
        public String licenseKeyFormatting(String S, int K) {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for(int i=S.length()-1;i>=0;i--) {
                char c = S.charAt(i);
                if(c=='-') continue;
                if(c>='a') c-=32;
                count++;
                sb.append(c);
                if(count==K) {
                    sb.append('-');
                    count=0;
                }
            }
            if(sb.length()==0) return "";
            if(sb.charAt(sb.length()-1)=='-') sb.deleteCharAt(sb.length()-1);
            return  sb.reverse().toString();
        }
    }

    public static void main(String[] args) {
        String res = new Solution().licenseKeyFormatting("---",3);
        System.out.println(res);
    }
}
