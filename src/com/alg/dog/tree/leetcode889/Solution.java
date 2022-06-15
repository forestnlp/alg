package com.alg.dog.tree.leetcode889;

import com.alg.dog.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/15 - 06 - 15 - 15:01
 * @Description: com.alg.dog.tree.leetcode889
 * @version: 1.0
 */
public class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            map.put(postorder[i], i);
        }
        TreeNode root = helper(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
        return root;
    }


    public TreeNode helper(int[] preorder, int preStart, int preEnd, int[] postorder, int postStart, int postEnd) {
        if (preStart > preEnd) return null;
        if (preStart == preEnd) return new TreeNode(preorder[preStart]);

        int val = preorder[preStart];
        int leftRootVal = preorder[preStart + 1];
        int index = map.get(leftRootVal);
        int leftSize = index - postStart + 1;

        TreeNode root = new TreeNode(val);
        root.left = helper(preorder, preStart + 1, preStart + leftSize, postorder, postStart, index);
        root.right = helper(preorder, preStart + leftSize + 1, preEnd, postorder, index + 1, postEnd - 1);
        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] post = {4, 5, 2, 6, 7, 3, 1};
        TreeNode root = new Solution().constructFromPrePost(pre, post);
    }
}
