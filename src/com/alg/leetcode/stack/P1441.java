package com.alg.leetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class P1441 {
    class Solution {
        public List<String> buildArray(int[] target, int n) {
            List<String> operations = new ArrayList<>();
            int k = 0;
            for(int i=1;i<=n;i++) {
                if(i<target[k]) {
                    operations.add("Push");
                    operations.add("Pop");
                }
                else if(i==target[k]) {
                    operations.add("Push");
                    if(k<target.length-1) k++;
                }
                else
                    break;
            }
            return operations;
        }
    }
}
