package com.alg.leetcode.tree;


import java.util.HashMap;
import java.util.Map;

/**
 * same as P105
 */
public class PM07M {
    class Solution {
        Map<Integer,Integer> inorderMap = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for(int i=0;i<inorder.length;i++) {
                inorderMap.put(inorder[i],i);
            }
            return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        }

        public TreeNode buildTree(int[] preorder,int preorderStart,int preorderEnd, int[] inorder,int inorderStart,int inorderEnd) {
            if(preorderStart>preorderEnd||inorderStart>inorderEnd) return null;

            TreeNode root = new TreeNode(preorder[preorderStart]);

            if(preorderStart==preorderEnd) return root;

            int cutPoint = inorderMap.get(root.val);
            int len = cutPoint-inorderStart;

            root.left = buildTree(preorder,preorderStart+1,preorderStart+len,inorder,inorderStart,inorderStart+len-1);
            root.right = buildTree(preorder,preorderStart+len+1,preorderEnd,inorder,inorderStart+len+1,inorderEnd);

            return root;
        }
    }

    public static void main(String[] args) {
        int [] preorder = {3,9,20,15,7};
        int [] inorder = {9,3,15,20,7};
        PM07M problem = new PM07M();
        Solution solution = problem.new Solution();
        TreeNode res = solution.buildTree(preorder,inorder);
    }

}
