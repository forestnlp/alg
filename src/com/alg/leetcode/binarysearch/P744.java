package com.alg.leetcode.binarysearch;

public class P744 {
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int i=0,j=letters.length;
            while (i<j) {
                int m = i+(j-i)/2;
                System.out.printf("i,j,m %d %d %d %c \n",i,j,m,letters[m]);
                if(target<letters[m]) j=m;
                else if(target>letters[m]) i=m+1;
                else i=m+1;
            }
            return i>letters.length-1?letters[0]:letters[i];
        }
    }

    public static void main(String[] args) {
        Solution solution = new P744().new Solution();
        char r = solution.nextGreatestLetter(new char[]{'a','b','f','g'},'a');
        System.out.println(r);
    }
}
