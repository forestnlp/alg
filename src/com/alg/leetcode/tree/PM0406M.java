package com.alg.leetcode.tree;

public class PM0406M {
    class Solution {

        boolean foundP = false;
        TreeNode target = null;
        public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

            if(root==null) return null;

            inorderSuccessor(root.left,p);

            if(foundP&&target==null) {
                target = root;
            };

            if(root.val == p.val) foundP = true;

            inorderSuccessor(root.right,p);

            return target;
        }

    }

    public static void main(String[] args) {
        Integer [] array = {2,null,3};
        TreeNode node = TreeNode.getInstance(array);
        PM0406M problem = new PM0406M();
        Solution solution = problem.new Solution();
        TreeNode res = solution.inorderSuccessor(node,new TreeNode(3));
        System.out.println(res);
    }
}
