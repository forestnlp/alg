package com.alg.leetcode.greedy;

public class P944 {
    class Solution {
        public int minDeletionSize(String[] A) {
            int ans = 0;
            for(int c =0;c<A[0].length();c++) {
                for(int r =1;r<A.length;r++) {
                    if(A[r].charAt(c)<A[r-1].charAt(c)) {
                        ans++;
                        break;
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {

        int i=0;
        int k=0;

        flag:for(i=0;i<12;i++) {
            for(k=0;k<12;k++) {
                if(i==5&&k==5) {
                    continue;
                }
                System.out.printf("i = %d,k=%d \n",i,k);
            }
        }

    }
}
