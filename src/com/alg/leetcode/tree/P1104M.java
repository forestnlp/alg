package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P1104M {
    class Solution {
        public List<Integer> pathInZigZagTree(int label) {
            List<Integer> ans = new ArrayList<>();
            int level = log2(label);
            label = change(label, level);
            while (level > 0) {
                ans.add(0,change(label, level));
                label/=2;
                level -=1;
            }
            return ans;
        }

        public int change(int label, int level) {
            if (level % 2 == 0)
                return (int) Math.pow(2, level-1) + (int) Math.pow(2, level ) - 1 - label;
            else
                return label;
        }

        public int log2(int label) {
            int lvl = 1;
            while (label > 1) {
                label /= 2;
                lvl++;
            }
            return lvl;
        }
    }
}
