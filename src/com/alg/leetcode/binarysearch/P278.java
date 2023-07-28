package com.alg.leetcode.binarysearch;

public class P278 {

    class VersionControl {
        boolean isBadVersion(int n) {
            if(n>=6)
                return true;
            return false;
        }
    }

    class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int i=0,j=n;
            while (i<j) {
                int m = i + (j-i)/2;
               // System.out.printf("i,j,m, %d,%d,%d",i,j,m);
                boolean isBad = isBadVersion(m);
                if(isBad) j=m;
                else i=m+1;
            }
            return i;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P278().new Solution();
        System.out.println(solution.firstBadVersion(10));;
    }
}
