package com.alg.leetcode.math;

public class P1281 {
    class Solution {
        public int subtractProductAndSum(int n) {
            String str = String.valueOf(n);
            int sum = 0,product = 1;
            for(char c :str.toCharArray()) {
                int i = c-'0';
                product*=i;
                sum+=i;
            }
            return product-sum;
        }
    }
}
