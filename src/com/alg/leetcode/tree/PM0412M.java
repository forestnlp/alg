package com.alg.leetcode.tree;

public class PM0412M {
    class Solution {

        public int pathSum(TreeNode root, int sum) {
            if(root==null) return 0;

            return pathSum(root.left,sum)+pathSum(root.right,sum)+dfs(root,sum);
        }

        public int dfs(TreeNode node,int sum) {
            if(node==null) return 0;
            if(node.val==sum) return 1+dfs(node.left,0)+dfs(node.right,0);
            return dfs(node.left,sum-node.val)+dfs(node.right,sum-node.val);
        }
    }
}
