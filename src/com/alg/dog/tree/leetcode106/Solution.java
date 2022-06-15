package com.alg.dog.tree.leetcode106;

import com.alg.dog.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/15 - 06 - 15 - 14:58
 * @Description: com.alg.dog.tree.leetcode106
 * @version: 1.0
 */
public class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = helper(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }

    public TreeNode helper(int[] postorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (pStart > pEnd) return null;

        int val = postorder[pEnd];
        int iIndex = map.get(val);
        int leftSize = iIndex - iStart;

        TreeNode root = new TreeNode(val);

        root.left = helper(postorder, pStart, pStart + leftSize - 1, inorder, iStart, iIndex - 1);
        root.right = helper(postorder, pStart + leftSize, pEnd - 1, inorder, iIndex + 1, iEnd);
        return root;
    }
}
