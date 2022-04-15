package com.alg.sword.jz66;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] multiply(int[] A) {
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        int[] B = new int[A.length];

        left[0] = A[0];
        right[right.length - 1] = A[A.length - 1];

        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] * A[i];
        }
        for (int i = left.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * A[i];
        }
        for (int i = 0; i < B.length; i++) {
            if (i == 0) B[i] = 1 * right[1];
            else if (i == B.length - 1) B[i] = left[B.length - 2];
            else
                B[i] = left[i - 1] * right[i + 1];
        }
        return B;
    }

    public static void main(String[] args) {
        int[] B = new Solution().multiply(new int[]{1, 2, 3, 4, 5});
        for (int n : B) {
            System.out.println(n);
        }
    }
}