package com.alg.sword.jz66;

public class Solution2 {
    public int[] multiply(int[] A) {
        int[] left = new int[A.length];
        int[] B = new int[A.length];

        left[0] = A[0];

        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] * A[i];
        }

        int temp = 1;
        for (int i = B.length - 1; i >= 1; i--) {
            B[i] = left[i - 1] * temp;
            temp *= A[i];
        }
        B[0]=temp;
        return B;
    }

    public static void main(String[] args) {
        int[] B = new Solution2().multiply(new int[]{1, 2, 3, 4, 5});
        for (int n : B) {
            System.out.println(n);
        }
    }
}