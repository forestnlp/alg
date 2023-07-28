package com.alg.leetcode.tree;

public class PM26M {
    class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {

            if(A==null) return false;
            if(B==null) return false;

            return isSameTree(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
        }

        public boolean isSameTree(TreeNode A,TreeNode B) {

            if(B==null) return true;
            if(A==null) return false;

            return (A.val==B.val)&&isSameTree(A.left,B.left)&&isSameTree(A.right,B.right);
        }
    }
}
