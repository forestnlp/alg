package com.alg.leetcode.tree;

public class P606 {
    class Solution {

        public String tree2str(TreeNode t) {
            StringBuffer tree = helper(t);
            return tree.toString();
        }

        public StringBuffer helper(TreeNode node) {
            StringBuffer sb = new StringBuffer();
            if(node==null) return sb;

            sb.append(node.val);

            if(node.left==null&&node.right==null)
                return sb;

            sb.append('(');
            sb.append(helper(node.left));
            sb.append(')');

            if(node.right!=null) {
                sb.append('(');
                sb.append(helper(node.right));
                sb.append(')');
            }

            return sb;
        }
    }
}
