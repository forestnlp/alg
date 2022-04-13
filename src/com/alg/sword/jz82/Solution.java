package com.alg.sword.jz82;

import java.util.*;

public class Solution {

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if(root==null) return false;
        if(root.left==null&&root.right==null&&root.val==sum) return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}