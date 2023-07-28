package com.alg.leetcode.string;

public class P434 {
    class Solution {
        public int countSegments(String s) {
            if(s==null||s.length()==0) return 0;
            String [] strs = s.split("\\s+");
            int ans = 0;
            for(String str:strs) {
                if(!str.trim().equals(""))
                    ans++;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        String s = "    foo    bar";
        String [] strs = s.split("\\s+");
        for(String str:strs) {
            System.out.println(str);
        }
    }
}
