package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P830 {
    class Solution {
        public List<List<Integer>> largeGroupPositions(String S) {
            List<List<Integer>> ans= new ArrayList<>();
            char[] array = S.toCharArray();

            char c =0;
            int start=0;

            for(int i=0;i<array.length;i++) {
                char cur = array[i];
                start = i;
                while (i+1<array.length&&cur==array[i+1]) {
                    i++;
                }
                if(i-start>=2) {
                    List<Integer> list = Arrays.asList(start,i);
                    ans.add(list);
                }
            }
            return ans;
        }
    }
}
