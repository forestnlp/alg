package com.alg.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class P1346 {
    class Solution {
        public boolean checkIfExist(int[] arr) {
            Set<Integer> set = new HashSet<>();
            for(int n:arr) {
                if(set.contains(2*n)||(set.contains(n/2)&&n%2==0)) return true;
                set.add(n);
            }
            return false;
        }
    }
}
