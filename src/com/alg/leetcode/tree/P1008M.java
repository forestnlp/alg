package com.alg.leetcode.tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1008M {
    class Solution {

        Map<Integer,Integer> inorderMap = new HashMap<>();

        public TreeNode bstFromPreorder(int[] preorder) {
            if(preorder==null) return null;

            int [] inorder = Arrays.copyOf(preorder,preorder.length);
            Arrays.sort(inorder);
            for(int i=0;i<inorder.length;i++) {
                inorderMap.put(inorder[i],i);
            }

            TreeNode root = helper(preorder,inorder,0,preorder.length-1,0,inorder.length-1);

            return root;
        }

        public TreeNode helper(int[] preorder,int[] inorder,int prelow,int prehigh,int inlow,int inhigh) {
            if(prelow>prehigh) return null;
            TreeNode root = new TreeNode(preorder[prelow]);
            int rootIndex = inorderMap.get(root.val);
            int len = rootIndex-inlow;
            System.out.println(root.val);
            root.left = helper(preorder,inorder,prelow+1,prelow+len,inlow,rootIndex-1);
            root.right = helper(preorder,inorder,prelow+len+1,prehigh,rootIndex+1,inhigh);
            return root;
        }
    }

    public static void main(String[] args) {
        int [] array = {8,5,1,7,10,12};
        P1008M problem = new P1008M();
        Solution solution = problem.new Solution();
        solution.bstFromPreorder(array);
    }
}
