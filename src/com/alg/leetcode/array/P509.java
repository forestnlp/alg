package com.alg.leetcode.array;

public class P509 {
    class Solution {
        public int fib(int N) {
            int prev = 0, cur = 1;
            if (N == 0) return 0;
            else if (N == 1) return 1;
            else {
                while (N - 2 >= 0) {
                    int tmp = cur;
                    cur = prev + cur;
                    prev = tmp;
                    N--;
                }
                return cur;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new P509().new Solution();
        int a = solution.fib(6);
        System.out.println(a);
    }
}
