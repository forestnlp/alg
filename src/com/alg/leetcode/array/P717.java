package com.alg.leetcode.array;

public class P717 {
    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
         int p = 0;
         while (p<bits.length-1) {
             if(bits[p]==1) p+=2;
             else p++;
         }
         if(p==bits.length) return false;
         return bits[p]==0;
        }
    }
}
