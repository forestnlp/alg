package com.alg.dog.tree.leetcode105;

import com.alg.dog.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }

    public TreeNode helper(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (pStart > pEnd) return null;

        int val = preorder[pStart];
        int iIndex = map.get(val);

        int leftSize = iIndex - iStart;

        TreeNode root = new TreeNode(val);
        root.left = helper(preorder, pStart + 1, pStart + leftSize, inorder, iStart, iIndex - 1);
        root.right = helper(preorder, pStart + leftSize + 1, pEnd, inorder, iIndex + 1, iEnd);
        return root;
    }
}