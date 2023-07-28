package com.alg.leetcode.array;

public class PM1710 {
    class Solution {
        public int majorityElement(int[] nums) {
            int element=-1;
            int vitualArraySize = 0;
            for(int n:nums) {
                if(vitualArraySize==0) {
                    element = n;
                    vitualArraySize++;
                }
                else {
                    if(n==element) vitualArraySize++;
                    else vitualArraySize--;
                }
            }
            return element;
        }
    }
}
