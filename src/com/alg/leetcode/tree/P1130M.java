package com.alg.leetcode.tree;

import java.util.Stack;

public class P1130M {
    class Solution {
        public int mctFromLeafValues(int[] arr) {
            int result = 0;

            boolean[] taged = new boolean[arr.length];
            for (int i = 0; i < arr.length - 1; i++) {
                int min = Integer.MAX_VALUE;
                int index = -1;
                for (int j = 0; j < arr.length; j++) {
                    if (!taged[j] && arr[j] < min) {
                        min = arr[j];
                        index = j;
                    }
                }

                System.out.println(index+":"+min);

                int l;
                for (l = index - 1; l >= 0 && taged[l]; l--);
                int leftVal = l < 0 ? Integer.MAX_VALUE : arr[l];
                int r;
                for (r = index + 1; r < arr.length && taged[r]; r++);
                int rightVal = r >= arr.length ? Integer.MAX_VALUE : arr[r];
                result += Math.min(leftVal, rightVal) * arr[index];

                System.out.println(result);

                taged[index] = true;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P1130M().new Solution();
        int res = solution.mctFromLeafValues(new int[] {2,3,1,4});
        System.out.println(res);
    }
}
