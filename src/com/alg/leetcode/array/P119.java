package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P119 {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> prev = new ArrayList<>();
            List<Integer> ans = new ArrayList<>();
            if(rowIndex==0)
                return Arrays.asList(1);
            else if(rowIndex==1)
                return Arrays.asList(1,1);

            prev =  Arrays.asList(1,1);
            while (rowIndex-1>0) {
                ans = new ArrayList<>();
                ans.add(1);
                for(int i=1;i<prev.size();i++) {
                    ans.add(prev.get(i)+prev.get(i-1));
                }
                ans.add(1);
                prev = ans;
                rowIndex--;
            }
            return ans;
        }
    }
}
