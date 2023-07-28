package com.alg.leetcode.tree;

import java.util.*;

public class P1443M {

    class Solution {
        public int minTime(int n, int[][] edges, List<Boolean> hasApple) {

            Map<Integer,Integer> parentMap = new HashMap<>();

            for(int [] edge:edges) {
                int parent = edge[0];
                int son = edge[1];
                if(parentMap.containsKey(son))
                    parentMap.put(parent,son);
                else
                    parentMap.put(son,parent);
            }

            Set<Integer> apples = new HashSet<>();

            for(int i=0;i<hasApple.size();i++) {
                if(hasApple.get(i)) {
                    int apple = i;
                    while(apple!=0) {
                        apples.add(apple);
                        apple = parentMap.get(apple);
                    }
                }
            }

            return apples.size()*2;
        }
    }

}
