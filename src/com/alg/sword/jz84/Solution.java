package com.alg.sword.jz84;

import java.util.*;


public class Solution {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类
     * @param sum  int整型
     * @return int整型
     */

    Map<TreeNode,Integer> counter = new HashMap<>();
    public int FindPath(TreeNode root, int sum) {
        // write code here
        if(root==null) return 0;
        int left = FindPath(root.left,sum);
        int right = FindPath(root.right,sum);
        int centre = helper(root,root,sum);
        return left+right+centre;
    }

    public int helper(TreeNode root,TreeNode cur,int sum){
        if(root==null||cur==null) return 0;
        int n = 0;
        if(cur.val==sum) n = 1;
        return n+helper(root,cur.left,sum-cur.val)+helper(root,cur.right,sum-cur.val);
    }
}