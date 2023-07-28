package com.alg.leetcode.recursion;

import java.util.HashMap;
import java.util.Map;

public class PM10I {
    class Solution {
        Map<Integer,Long> map = new HashMap<Integer,Long>(){{
            put(0,0l);
            put(1,1l);
        }};
        public int fib(int n) {
            if(map.containsKey(n)) return (int)(map.get(n)%1000000007);
            long ans = fib(n-1)+fib(n-2);
            map.put(n,ans);
            return (int)(ans%1000000007);
        }
    }
}
