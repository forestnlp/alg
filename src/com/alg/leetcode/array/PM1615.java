package com.alg.leetcode.array;

public class PM1615 {
    class Solution {
        public int[] masterMind(String solution, String guess) {
            char [] sol = solution.toCharArray();
            char [] gue = guess.toCharArray();
            int right=0,simright=0;
            for(int i=0;i<sol.length;i++) {
                if(sol[i]==gue[i]) {
                    right++;
                    sol[i]='0';
                    gue[i]='-';
                }
            }

            for(int i=0;i<gue.length;i++) {
                if(gue[i]=='-') continue;
                for(int k=0;k<sol.length;k++) {
                    if(sol[k]=='0') continue;
                    if(sol[k]==gue[i]) {
                        sol[k]='0';
                        gue[i]='-';
                        simright++;
                    }
                }
            }

            return new int[] {right,simright};
        }
    }
}
