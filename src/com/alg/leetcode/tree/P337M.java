package com.alg.leetcode.tree;

import java.util.HashMap;

public class P337M {

    class Solution {

        HashMap<TreeNode, Integer> valueDic = new HashMap<>();

        public int rob(TreeNode root) {

            if(root==null) return 0;

            helper(root);

            return valueDic.get(root);
        }


        public int helper(TreeNode root) {
            if (root == null) return 0;

            if (valueDic.containsKey(root)){
                return valueDic.get(root);
            }

            TreeNode left = root.left;
            TreeNode right = root.right;

            int val = root.val;
            if (left != null) val += (helper(left.left) + helper(left.right));
            if (right != null) val += (helper(right.left) + helper(right.right));

            int curval = Math.max(val, helper(left)+helper(right));

            valueDic.put(root, curval);

            return curval;
        }
    }

    public static void main(String[] args) {
            Integer [] array = {4,1,null,2,null,3};
            TreeNode node = TreeNode.getInstance(array);
            P337M problem = new P337M();
            Solution solution = problem.new Solution();
            int res = solution.rob(node);
        System.out.println(res);
        System.out.println(solution.valueDic);
    }
}
