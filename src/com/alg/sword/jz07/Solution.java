package com.alg.sword.jz07;

public class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] vin) {
        if(pre==null||pre.length==0) return null;

        int rootval = pre[0];

        //查出中序遍历根节点的位置
        int pos = -1;
        for(int i=0;i<vin.length;i++) {
            if(vin[i]==rootval) {
                pos = i;
                break;
            }
        }

        int left_len = pos;
        int right_len = pre.length-1-pos;

        int[] pre_left = new int[left_len];
        int[] pre_right = new int[right_len];
        int[] vin_left = new int[left_len];
        int[] vin_right = new int[right_len];

        System.arraycopy(pre,1,pre_left,0,left_len);
        System.arraycopy(pre,1+left_len,pre_right,0,right_len);
        System.arraycopy(vin,0,vin_left,0,left_len);
        System.arraycopy(vin,1+left_len,vin_right,0,right_len);

        TreeNode node = new TreeNode(rootval);
        node.left = reConstructBinaryTree(pre_left,vin_left);
        node.right = reConstructBinaryTree(pre_right,vin_right);
        return node;
    }

    public static void main(String[] args) {
        TreeNode node = new Solution().reConstructBinaryTree(new int[]{1,2,4,7,3,5,6,8}, new int[]{4,7,2,1,5,3,8,6});
    }
}