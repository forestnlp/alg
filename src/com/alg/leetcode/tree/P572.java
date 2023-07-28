package com.alg.leetcode.tree;

public class P572 {
    class Solution {
        public boolean isSubtree(TreeNode s, TreeNode t) {
            if(t==null) return true;
            if(s==null) return false;
            if(s.val!=t.val) {
                return isSubtree(s.left,t)||isSubtree(s.right,t);
            }
            else {
                return isSametree(s,t);
            }
        }

        public boolean isSametree(TreeNode t1,TreeNode t2) {
            if(t1==null&&t2==null) return true;
            if(t1==null||t2==null) return false;
            return (t1.val==t2.val)&&isSametree(t1.left,t2.left)&&isSametree(t1.right,t2.right);
        }
    }
}
