package com.alg.leetcode.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P859 {
    class Solution {
        public boolean buddyStrings(String A, String B) {
            if(A==null) return B==null;
            if(B==null) return false;
            if(A.length()!=B.length()) return false;
            if(A.equals(B)) {
                Set<Character> set = new HashSet<>();
                for(char c:A.toCharArray()) {
                    if(set.contains(c)) return true;
                    set.add(c);
                }
                return false;
            }

            int cnt=0;
            String A_diff="",B_diff="";
            for(int i=0;i<A.length();i++) {
                if(A.charAt(i)!=B.charAt(i)) {
                    A_diff=A_diff+A.charAt(i);
                    B_diff=B.charAt(i)+B_diff;
                    cnt++;
                }
                if(cnt>2) return false;
            }
            if(cnt==2) return A_diff.equals(B_diff);
            return false;
        }
    }
}
