package com.alg.leetcode.math;

import java.util.ArrayList;
import java.util.List;

public class P401 {
    static class Solution {
        public List<String> readBinaryWatch(int num) {
            List<String> ans = new ArrayList<>();
            //bitcount
            for(int i=0;i<12;i++) {
                int n = Integer.bitCount(i);
                for(int j=0;j<=59;j++) {
                    if(n + Integer.bitCount(j)==num)
                    {
                        if(j<10)
                        ans.add(i+":0"+j);
                        else
                        ans.add(i+":"+j);
                    }
                }
            }
            return ans;
        }
    }
}
