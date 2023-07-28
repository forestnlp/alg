package com.alg.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class P106M {
    class Solution {
        Map<Integer,Integer> inOrderMap = new HashMap<>();
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            if(inorder==null) return null;
            for(int i=0;i<inorder.length;i++) {
                inOrderMap.put(inorder[i],i);
            }
            return helper(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
        }

        public TreeNode helper(int[] inorder,int[] postorder,int inlow,int inhigh,int postlow,int posthigh) {
            if(inlow>inhigh) return null;

            TreeNode root = new TreeNode(postorder[posthigh]);

            int rootIndex = inOrderMap.get(root.val);

            int leftSubTreeLength = rootIndex - inlow;

            root.left = helper(inorder,postorder,inlow,rootIndex-1,postlow,postlow+leftSubTreeLength-1);
            root.right = helper(inorder,postorder,rootIndex+1,inhigh,postlow+leftSubTreeLength,posthigh-1);
            return root;
        }
    }

    public static void main(String[] args) {
        int [] inorder= {9,3,15,20,7};
        int [] postorder= {9,15,7,20,3};
        P106M problem = new P106M();
        Solution solution = problem.new Solution();
        TreeNode res = solution.buildTree(inorder,postorder);
    }
}
