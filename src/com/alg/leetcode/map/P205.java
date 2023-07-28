package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class P205 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            if(s==null) return t==null;
            if(t==null) return false;
            if(s.length()!=t.length()) return false;

            Map<Character,Character> dic = new HashMap<>();
            char[] sArr = s.toCharArray();
            char[] tArr = t.toCharArray();
            for(int i=0;i<sArr.length;i++) {
                char c_s = sArr[i];
                char c_t = tArr[i];
                if(dic.containsKey(c_s)) {
                    if(dic.get(c_s)!=c_t)  return false;
                }
                else {
                    if(dic.containsValue(c_t)) return false;
                    dic.put(c_s,c_t);
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        boolean b = new P205().new Solution().isIsomorphic("ab","aa");
        System.out.println(b);
    }
}
