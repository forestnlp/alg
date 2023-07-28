package com.alg.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class P1026M {
    class Solution {

        int maxDiff = 0;

        public int maxAncestorDiff(TreeNode root) {
            dfs(root,root.val,root.val);
            return maxDiff;
        }

        public void dfs(TreeNode node,int max,int min) {
            if(node==null) return;
            if(node.val>max) max= node.val;
            if(node.val<min) min = node.val;

            maxDiff = Math.max(max-min,maxDiff);

            dfs(node.left,max,min);
            dfs(node.right,max,min);
        }
    }
}
