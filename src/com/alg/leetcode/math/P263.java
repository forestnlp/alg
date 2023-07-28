package com.alg.leetcode.math;

import java.util.Arrays;
import java.util.List;

public class P263 {
    class Solution {
        public boolean isUgly(int num) {
            if(num==0) return false;
            List<Integer> factors = Arrays.asList(2,3,5);
            while (num!=1) {
                boolean flag = true;
                for (int fact : factors) {
                    if (num % fact == 0){
                        flag=false;
                        num /= fact;
                    }
                }
                if(flag) break;
            }
            return num==1;
        }
    }
}
