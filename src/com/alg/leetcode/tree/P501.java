package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P501 {

    class Solution {

        int occurCurTimes = 1;
        int occurMaxTimes = 0;

        TreeNode preNode;

        List<TreeNode> res = new ArrayList<>();

        public int[] findMode(TreeNode root) {

            if(root==null) return new int[]{};

            InOrderTravel(root);
            int[] modes = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                modes[i] = res.get(i).val;
            }
            return modes;
        }

        public void InOrderTravel(TreeNode node) {

            if (node == null) return;
            InOrderTravel(node.left);
            if (preNode != null) {
                if (node.val == preNode.val) {
                    occurCurTimes++;
                } else {
                    occurCurTimes = 1;
                }
            }
            if (occurCurTimes == occurMaxTimes) {
                res.add(node);
            }
            else if (occurCurTimes > occurMaxTimes) {
                occurMaxTimes = occurCurTimes;
                res.clear();
                res.add(node);
            }
            preNode = node;
            InOrderTravel(node.right);
        }
    }
}
