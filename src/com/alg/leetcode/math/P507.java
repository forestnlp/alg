package com.alg.leetcode.math;

public class P507 {
    class Solution {
        public boolean checkPerfectNumber(int num) {
            if(num<=0) return false;
            int sum = 0;
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0)
                {
                    sum += i;
                    if (i * i != num )
                        sum += num / i;
                }

            }
            if (sum -num == num) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P507().new Solution();
        boolean res = solution.checkPerfectNumber(28);
        System.out.println(res);
    }
}
