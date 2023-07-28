package com.alg.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class P105M {
    class Solution {

        Map<Integer,Integer> inorderMap = new HashMap<Integer,Integer>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for(int i=0;i<inorder.length;i++) {
                inorderMap.put(inorder[i],i);
            }

            return helper(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
        }

        public TreeNode helper(int[] preorder,int[] inorder,int prelow,int prehigh,int inlow,int inhigh) {
            if(preorder==null) return null;
            if(prelow>prehigh) return null;
            TreeNode root = new TreeNode(preorder[prelow]);

            int rootIndex = inorderMap.get(root.val);

            int len = rootIndex - inlow ;

            root.left = helper(preorder,inorder,prelow+1,prelow+len ,inlow,rootIndex-1);
            root.right = helper(preorder,inorder,prelow+len+1,prehigh,rootIndex+1,inhigh);

            return root;
        }
    }

    public static void main(String[] args) {
        int [] inorder= {9,3,15,20,7};
        int [] preorder= {9,15,7,20,3};
        P105M problem = new P105M();
        Solution solution = problem.new Solution();
        TreeNode res = solution.buildTree(inorder,preorder);
    }
}
