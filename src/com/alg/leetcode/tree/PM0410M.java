package com.alg.leetcode.tree;

public class PM0410M {
    class Solution {
        public boolean checkSubTree(TreeNode t1, TreeNode t2) {
            if(t2==null) return true;
            if(t1==null) return false;
            return ((t1.val==t2.val)&&isSameTree(t1,t2))||checkSubTree(t1.left,t2)||checkSubTree(t1.right,t2);
        }

        public boolean isSameTree(TreeNode t1,TreeNode t2) {
            if(t1==null&&t2==null) return true;
            if(t1==null||t2==null) return false;
            if(t1.val==t2.val)
                return isSameTree(t1.left,t2.left)&&isSameTree(t1.right,t2.right);
            return false;
        }
    }
}
