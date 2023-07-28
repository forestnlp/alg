package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P199M {

    class Solution {
        List<Integer> nodes = new ArrayList<>();

        public List<Integer> rightSideView(TreeNode root) {
            helper(root,0);
            return nodes;
        }

        public void helper(TreeNode node,int depth) {
            if(node==null) return;
            if(nodes.size()-1<depth)
                nodes.add(node.val);
            helper(node.right,depth+1);
            helper(node.left,depth+1);
        }
    }
}
