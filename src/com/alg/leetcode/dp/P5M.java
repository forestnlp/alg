package com.alg.leetcode.dp;

public class P5M {
    class Solution {
        public String longestPalindrome(String s) {
            int len = s.length();
            int maxlen = 1;
            int startpos = 0;
            boolean [][] dp = new boolean[len][len];
            for(int i=0;i<len;i++) {
                dp[i][i] = true;
            }
            for(int j=0;j<len;j++) {
                for(int i=0;i<j;i++) {
                    if(s.charAt(i)!=s.charAt(j))
                        dp[i][j] = false;
                    else if(j==i+1)
                        dp[i][j] = true;
                    else
                        dp[i][j]=dp[i+1][j-1];

                    if(dp[i][j]&&j-i+1>maxlen) {
                        startpos = i;
                        maxlen = j-i+1;
                    }
                }
            }
            return s.substring(startpos,startpos+maxlen);
        }
    }

    public static void main(String[] args) {
        Solution solution = new P5M().new Solution();
        String res = solution.longestPalindrome("aaaaabbbbaaaaabbbb");
        System.out.println(res);
    }

}
