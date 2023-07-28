package com.alg.leetcode.recursion;

import java.util.List;

public class PM0806 {

    class Solution {

        public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
            int n = A.size();
            move(n, A, B, C);
        }

        public void move(int n, List<Integer> from, List<Integer> aux, List<Integer> to) {
            if(n==1) {
                to.add(from.remove(from.size()-1));
                return;
            }
            move(n-1,from,to,aux);
            to.add(from.remove(from.size()-1));
            move(n-1,aux,from,to);
        }
    }
}
