package com.alg.leetcode.array;

public class P985 {
    class Solution {
        public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
            int sum = 0;
            for (int n : A) {
                if (n % 2 == 0) sum += n;
            }

            int[] ans = new int[queries.length];
            for(int i=0;i<queries.length;i++) {
                int delta = queries[i][0];
                int index = queries[i][1];
                int before = A[index];
                int after = A[index]+delta;
                if(before%2==0) sum-=before;
                if(after%2==0) sum+=after;
                A[index] = after;
                ans[i] = sum;
            }
            return ans;
        }
    }
}
