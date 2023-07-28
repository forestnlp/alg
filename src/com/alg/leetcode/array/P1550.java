package com.alg.leetcode.array;

public class P1550 {
    class Solution {
        public boolean threeConsecutiveOdds(int[] arr) {
            int p = 0;
            while (p<=arr.length-3) {
                if(odd(arr[p+2])) {
                    if(odd(arr[p+1])) {
                        if(odd(arr[p])) {
                            return true;
                        }
                        else {
                            p++;
                        }
                    }
                    else {
                        p = p+2;
                    }
                }
                else {
                    p = p+3;
                }
            }
            return false;
        }

        public boolean odd(int num) {
            return num%2==1;
        }

    }
}
