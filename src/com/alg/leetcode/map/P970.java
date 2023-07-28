package com.alg.leetcode.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P970 {
    class Solution {
        public List<Integer> powerfulIntegers(int x, int y, int bound) {
            int logBound = 20;
            Set<Integer> ans  = new HashSet<>();
            for(int i=0;i<logBound;i++) {
                for(int j=0;j<logBound;j++){
                    if(bound-(int)Math.pow(x,i)>=(int)Math.pow(y,j))
                        ans.add((int)(Math.pow(x,i)+Math.pow(y,j)));
                }
            }
            return new ArrayList<>(ans);
        }
    }
}
