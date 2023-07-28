package com.alg.leetcode.recursion;

import java.util.HashMap;
import java.util.Map;

public class P1137 {
    class Solution {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>(){{
            put(0,0);
            put(1,1);
            put(2,1);
        }};
        public int tribonacci(int n) {
            if(map.containsKey(n)) return map.get(n);
            int res = tribonacci(n-3)+tribonacci(n-1)+tribonacci(n-2);
            map.put(n,res);
            return res;
        }
    }
}
