package com.alg.sword.jz68;

public class Solution {
    static  public class TreeNode {
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
     * 
     * @param root TreeNode类 
     * @param p int整型 
     * @param q int整型 
     * @return int整型
     */
    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        // write code here
        int val = root.val;
        //只可能在左右两侧或者根节点
        if(val==p||val==q){
            return val;
        }

        int small = p>=q?q:p;
        int large = p>=q?p:q;

        if(small<val&&large<val) return lowestCommonAncestor(root.left,p,q);
        else if(small>val&&large>val) return lowestCommonAncestor(root.right,p,q);
        else return val;
    }
}