package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P653 {
    class Solution {
        List<TreeNode> nodes = new ArrayList<>();

        public boolean findTarget(TreeNode root, int k) {
            inOrder(root);
            int low=0,high= nodes.size()-1;
            while(low<=high) {
                int sum = nodes.get(low).val + nodes.get(high).val;
                if(sum==k) return true;
                if(sum<k) low++;
                if(sum>k) high--;
            }
            return false;
        }

        public void inOrder(TreeNode node) {
            if(node==null) return;
            inOrder(node.left);
            nodes.add(node);
            inOrder(node.right);
        }
    }
}
