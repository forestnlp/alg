package com.alg.leetcode.greedy;

public class P1518 {
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {

            int emptyBottles = numBottles;
            int wines = numBottles;

            while (emptyBottles>=numExchange) {
                int exchange = emptyBottles/numExchange;
                wines+=exchange;
                emptyBottles = exchange+emptyBottles%numExchange;
            }

            return wines;
        }
    }
}
