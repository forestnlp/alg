package com.alg.dog.tree.bst.leetcode1373;

import com.alg.dog.tree.TreeNode;

public class Solution {

    int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        traverse(root);
        return maxSum;
    }

    int[] traverse(TreeNode root) {
        //返回四元组，是否BST，BST的最小值、最大值、和
        if (root == null) {
            return new int[]{1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }

        int[] left = traverse(root.left);
        int[] right = traverse(root.right);

        int[] res = new int[4];

        if (left[0] == 1 && right[0] == 1 && left[2] < root.val && right[1] > root.val) {
            res[0] = 1;
            res[1] = Math.min(left[1], root.val);
            res[2] = Math.min(right[2], root.val);
            res[3] = left[3] + right[3] + root.val;
            maxSum = Math.max(maxSum,res[3]);
        } else {
            res[0] = 0;
        }
        return res;
    }
}