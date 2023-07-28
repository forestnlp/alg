package com.alg.leetcode.binarysearch;

public class P374 {

    class  GuessGame {
        int guess(int num) {
            return -1;
        }
    }
    class Solution extends GuessGame {
        public int guessNumber(int n) {
            int i=1,j=n;
            while (i<=j) {
                int m = i+(j-i)/2;
                int g = guess(m);
                if(g==0) return m;
                else if(g<0) i=m+1;
                else if(g>0) j=m-1;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P374().new Solution();
        int x = solution.guessNumber(10);
        System.out.println(x);
    }
}
