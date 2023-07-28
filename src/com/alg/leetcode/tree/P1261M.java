package com.alg.leetcode.tree;

import java.util.HashSet;
import java.util.Set;

public class P1261M {
    class FindElements {
        Set<Integer> values;
        public FindElements(TreeNode root) {
            values=new HashSet<>();
            dfs(root,0);
        }

        public void dfs(TreeNode node,int val) {
            if(node==null) return;
            node.val = val;
            values.add(val);
            dfs(node.left,2*val+1);
            dfs(node.right,2*val+2);
        }

        public boolean find(int target) {
            return values.contains(target);
        }
    }
}
