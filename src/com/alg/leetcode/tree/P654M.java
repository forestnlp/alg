package com.alg.leetcode.tree;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class P654M {
    class Solution {
        Map<Integer,Integer> numsMap = new HashMap<>();
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            if(nums==null) return null;
            for(int i=0;i<nums.length;i++) {
                numsMap.put(nums[i],i);
            }
            return helper(nums,0,nums.length-1);
        }

        public TreeNode helper(int[] nums,int start,int end) {
            int max = Integer.MIN_VALUE;
            if(start>end) return null;
            for(int i=start;i<=end;i++) {
                if(nums[i]>max) max = nums[i];
            }
            int index = numsMap.get(max);
            TreeNode root = new TreeNode(max);
            root.left = helper(nums,start,index-1);
            root.right = helper(nums,index+1,end);
            return root;
        }
    }
}
