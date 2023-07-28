package com.alg.leetcode.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1557 {
    class Solution {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

            List<Integer> ans = new ArrayList<>();
            Set<Integer> endpoints = new HashSet<>();

            for(List<Integer> list:edges) {
                endpoints.add(list.get(1));
            }

            for(int i=0;i<n;i++) {
                if(!endpoints.contains(i))
                    ans.add(i);
            }

            return ans;
        }
    }
}
