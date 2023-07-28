package com.alg.leetcode.tree;

/**
 * Created by mac on 2020/6/7.
 */
public class P543 {

    class Solution {

        int longestDistance = 0;

        public int diameterOfBinaryTree(TreeNode root) {

            helper(root);
            return longestDistance;

        }

        public int helper(TreeNode node) {

            if(node==null) return 0;


            int left = helper(node.left);
            int right = helper(node.right);


            int curLongestDistance = left+right;

            if(curLongestDistance>longestDistance)
                longestDistance = curLongestDistance;

            return Math.max(left,right)+1;
        }
    }
}
