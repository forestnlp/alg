package com.alg.leetcode.map;

public class P242 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s==null) return t==null;
            if(t==null) return false;
            if(s.length()!=t.length()) return false;
            char[] sarr = s.toCharArray();
            char[] tarr = t.toCharArray();
            int [] oarr = new int[128];
            for(char c:sarr) {
                oarr[c]++;
            }
            for(char c:tarr) {
                oarr[c]--;
                if(oarr[c]<0) return false;
            }
            for(int i=0;i<oarr.length;i++) {
                if(oarr[i]!=0) return false;
            }
            return true;
        }
    }
}
