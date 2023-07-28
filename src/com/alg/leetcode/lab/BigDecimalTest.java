package com.alg.leetcode.lab;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal(10);
        BigDecimal num2 = new BigDecimal(3);
        BigDecimal num3 = num1.divide(num2,20,BigDecimal.ROUND_CEILING);
        System.out.println(num3);
    }
}
