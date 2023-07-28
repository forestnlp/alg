package com.alg.leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P66 {
    class Solution {
        public int[] plusOne(int[] digits) {
            int carry = 1;
            int[] res = new int[digits.length + 1];
            for (int i = res.length; i >= 0; i--) {
                int d = (i >= 1 ? digits[i - 1] : 0) + carry;
                res[i] = d % 10;
                carry = d / 10;
            }
            if (res[0]>0) return res;
            else return Arrays.copyOfRange(res,1,res.length);
        }
    }
}
