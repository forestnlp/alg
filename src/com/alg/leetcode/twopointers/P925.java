package com.alg.leetcode.twopointers;

public class P925 {
    class Solution {
        public boolean isLongPressedName(String name, String typed) {
            int p1=0,p2=0;
            if(name.charAt(0)!=typed.charAt(0)) return false;
            while (p1<name.length()&&p2<typed.length()) {
                if (name.charAt(p1) == typed.charAt(p2)) {
                    p1++;
                    p2++;
                } else {
                    if (name.charAt(p1 - 1) != typed.charAt(p2)) return false;
                    p2++;
                }
            }
            if(p1!=name.length()) return false;
            while (p2<typed.length()) {
                if(typed.charAt(p2)!=typed.charAt(typed.length()-1))
                    return false;
                p2++;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P925().new Solution();
        boolean b = solution.isLongPressedName("alex","aaleex");
        System.out.println(b);
    }
}
