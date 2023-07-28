package com.alg.leetcode.tree;

public class PM0402 {

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {

            if(nums==null) return null;

            TreeNode root = centreNode(nums,0,nums.length-1);

            return root;
        }

        public TreeNode centreNode(int [] nums,int start,int end) {
            if(start>end) return null;

            int centre = start+(end-start)/2;

            TreeNode node = new TreeNode(nums[centre]);

            node.left = centreNode(nums,start,centre-1);

            node.right = centreNode(nums,centre+1,end);

            return node;
        }

    }
}
