package com.alg.leetcode.tree;

public class P1379M {
    class Solution {
        TreeNode targetCopy;
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            dfs(original,cloned,target);
            return targetCopy;
        }

        public void dfs(TreeNode original,TreeNode cloned,TreeNode target) {
            if(original==null) return;
            if(original==target) targetCopy = cloned;
            dfs(original.left,cloned.left,target);
            dfs(original.right,cloned.right,target);
        }
    }
}
