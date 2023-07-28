package com.alg.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class P1460 {
    class Solution {
        public boolean canBeEqual(int[] target, int[] arr) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int t:target) {
                map.put(t,map.getOrDefault(t,0)+1);
            }
            for(int a:arr) {
                if(!map.containsKey(a)) return false;
                else map.put(a,map.get(a)-1);
                if(map.get(a)<0) return false;
            }
            return true;
        }
    }
}
