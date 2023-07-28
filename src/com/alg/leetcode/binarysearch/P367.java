package com.alg.leetcode.binarysearch;

public class P367 {
    class Solution {
        public boolean isPerfectSquare(int num) {
            int i = 0, j = num;
            while (i <= j) {
                int mid = i + (j - i) / 2;
                long mid2 = (long)mid*mid;
                if (mid2 == num) return true;
                else if (mid2 > num) j = mid - 1;
                else i = mid + 1;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P367().new Solution();
        System.out.println(solution.isPerfectSquare(100000000));
    }
}
