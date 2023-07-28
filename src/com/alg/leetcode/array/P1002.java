package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class P1002 {
    class Solution {
        public List<String> commonChars(String[] A) {
            int[][] matrix = new int[26][A.length];
            for(int m=0;m<A.length;m++) {
                for(char c:A[m].toCharArray()) {
                    matrix[c-'a'][m] +=1;
                }
            }

            List<String> ans = new ArrayList<>();
            for(int m=0;m<matrix.length;m++) {
                int occurTimes = Integer.MAX_VALUE;
                for(int n=0;n<matrix[0].length;n++) {
                    occurTimes = Math.min(matrix[m][n],occurTimes);
                }
                for(int i=0;i<occurTimes;i++) {
                    char c = (char) ('a'+m);
                    ans.add(Character.toString(c));
                }
            }
            return ans;
        }
    }
}
