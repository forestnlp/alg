package com.alg.leetcode.tree;

public class P437 {
    class Solution {
        public int pathSum(TreeNode root, int sum) {
            if (root == null) return 0;

            return  paths(root,sum) +
                    pathSum(root.left, sum) +
                    pathSum(root.right, sum);
        }

        public int paths(TreeNode node,int sum) {
            int num = 0;
            if (node == null) return 0;
            if(node.val == sum) num = 1;

            return num+paths(node.left,sum-node.val)+paths(node.right,sum-node.val);
        }
    }
}
