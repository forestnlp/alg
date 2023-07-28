package com.alg.leetcode.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<>();
            if(numRows>0)
                ans.add(Arrays.asList(1));
            if(numRows>1)
                ans.add(Arrays.asList(1,1));
            while (numRows-2>0) {
                List<Integer> tmp = new ArrayList<>();
                List<Integer> lastone = ans.get(ans.size()-1);
                tmp.add(1);
                for(int i=1;i<lastone.size();i++) {
                    tmp.add(lastone.get(i)+lastone.get(i-1));
                }
                tmp.add(1);
                ans.add(tmp);
                numRows--;
            }
            return ans;
        }
    }
}
