package com.alg.leetcode.random;

import java.util.*;

public class P710 {
    class Solution {

        int [] b;
        int n;
        Random random;
        public Solution(int n, int[] b) {
            this.b = b;
            Arrays.sort(this.b);
            this.n = n;
            random = new Random();
        }

        public int pick() {
            while (true) {
                int rd = random.nextInt(n);
                int find = Arrays.binarySearch(b,rd);
                if(find==-1) return rd;
            }
        }
    }
}
