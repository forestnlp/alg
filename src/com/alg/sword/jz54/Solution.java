package com.alg.sword.jz54;

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
     * @param proot TreeNode类 
     * @param k int整型 
     * @return int整型
     */
    public int KthNode (TreeNode proot, int k) {
        // write code here
        ins(proot,k);

        return res;
    }

    private int count = 0;
    private int res = -1;

    public void ins(TreeNode node,int k) {
        if(node==null) return;
        ins(node.left,k);
        count++;
        if(count==k){
            res = node.val;
            return;
        }
        ins(node.right,k);
    }
}