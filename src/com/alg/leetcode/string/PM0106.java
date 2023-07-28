package com.alg.leetcode.string;

public class PM0106 {
    class Solution {
        public String compressString(String S) {
            if(S==null||S.length()==0) return "";
            int cnt = 1;
            char prev = S.charAt(0);
            StringBuffer sb = new StringBuffer();

            for(int i=1;i<S.length();i++) {
                char curChar = S.charAt(i);
                if(curChar!=prev) {
                    sb.append((char)prev+""+cnt);
                    prev = curChar;
                    cnt=1;
                }
                else{
                    cnt++;
                }
            }
            sb.append((char)prev+""+cnt);
            return sb.length()>=S.length()?S:sb.toString();
        }
    }
}
