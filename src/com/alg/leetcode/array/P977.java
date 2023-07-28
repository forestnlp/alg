package com.alg.leetcode.array;

public class P977 {
    class Solution {
        public int[] sortedSquares(int[] A) {
            int left = 0, right = A.length - 1;
            int[] S = new int[A.length];
            int i = S.length-1;
            int square = 0;
            while (left <= right) {
                int Aleft = A[left]*A[left];
                int Aright = A[right]*A[right];
                if (Aleft > Aright)
                    left++;
                else
                    right--;
                square = Math.max(Aleft,Aright);
                S[i] = square;
                i--;
            }
            return S;
        }
    }
}
