package com.alg.sword.jz37;

import java.util.ArrayList;

public class Solution {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    String Serialize(TreeNode root) {
        ArrayList<Integer> preOrder = preOrder(root);
        ArrayList<Integer> inOrder = inOrder(root);
        StringBuilder stringBuilder = new StringBuilder();
        if(preOrder!=null){
            for (int n : preOrder) {
                stringBuilder.append(n).append(",");
            }
        }
        stringBuilder.append(";");
        if(inOrder!=null){
            for (int n : inOrder) {
                stringBuilder.append(n).append(",");
            }
        }
        return stringBuilder.toString();
    }

    public ArrayList<Integer> preOrder(TreeNode root) {
        if (root == null) return null;
        ArrayList<Integer> prevs = new ArrayList<Integer>();
        prevs.add(root.val);
        ArrayList<Integer> left = preOrder(root.left) == null ? new ArrayList<Integer>() : preOrder(root.left);
        ArrayList<Integer> right = preOrder(root.right) == null ? new ArrayList<Integer>() : preOrder(root.right);
        prevs.addAll(left);
        prevs.addAll(right);
        return prevs;
    }

    public ArrayList<Integer> inOrder(TreeNode root) {
        if (root == null) return null;
        ArrayList<Integer> left = inOrder(root.left) == null ? new ArrayList<Integer>() : inOrder(root.left);
        left.add(root.val);
        ArrayList<Integer> right = inOrder(root.right) == null ? new ArrayList<Integer>() : inOrder(root.right);
        left.addAll(right);
        return left;
    }

    TreeNode Deserialize(String str) {
        String[] orders = str.split(";");
        if(orders==null||orders.length==0) return null;
        int size = orders[0].split(",").length ;

        int[] pre = new int[size];
        int[] vin = new int[size];
        int i=0;
        for (String s : orders[0].split(",")) {
            if (s.equals("")) continue;
            pre[i++] = Integer.parseInt(s);
        }
         i=0;
        for (String s : orders[1].split(",")) {
            if (s.equals("")) continue;
            vin[i++] = Integer.parseInt(s);
        }
        return reConstructBinaryTree(pre, vin) ;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] vin) {
        if (pre == null || pre.length == 0) return null;
        int rootval = pre[0];

        //查出中序遍历根节点的位置
        int pos = -1;
        for (int i = 0; i < vin.length; i++) {
            if (vin[i] == rootval) {
                pos = i;
                break;
            }
        }

        int left_len = pos;
        int right_len = pre.length - 1 - pos;

        int[] pre_left = new int[left_len];
        int[] pre_right = new int[right_len];
        int[] vin_left = new int[left_len];
        int[] vin_right = new int[right_len];

        /*
        * */

        System.arraycopy(pre, 1, pre_left, 0, left_len);
        System.arraycopy(pre, 1 + left_len, pre_right, 0, right_len);
        System.arraycopy(vin, 0, vin_left, 0, left_len);
        System.arraycopy(vin, 1 + left_len, vin_right, 0, right_len);

        TreeNode node = new TreeNode(rootval);
        node.left = reConstructBinaryTree(pre_left, vin_left);
        node.right = reConstructBinaryTree(pre_right, vin_right);
        return node;
    }

    public static void main(String[] args) {
        new Solution().Serialize(null);
    }
}