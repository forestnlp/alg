package com.alg.sword.jz37;

import java.util.ArrayList;

public class Solution3 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    String Serialize(TreeNode root) {
        StringBuilder preOrder = preOrder(root);
        StringBuilder inOrder = inOrder(root);
        StringBuilder stringBuilder = new StringBuilder();
        if(preOrder!=null) stringBuilder.append(preOrder);
        stringBuilder.append(";");
        if(inOrder!=null) stringBuilder.append(inOrder);
        return stringBuilder.toString();
    }

    private StringBuilder preOrder(TreeNode root) {
        if (root == null) return null;
        StringBuilder prevs = new StringBuilder();
        prevs.append(root.val);
        StringBuilder left = preOrder(root.left);
        StringBuilder right = preOrder(root.right);
        if (left!=null) prevs.append(","+left);
        if (right != null) prevs.append(","+right);
        return prevs;
    }

    private StringBuilder inOrder(TreeNode root) {
        if (root == null) return null;
        StringBuilder left = inOrder(root.left);
        if (left == null) left = new StringBuilder();
        if(left.length()==0) left.append(root.val);
        else  left.append(","+root.val);
        StringBuilder right = inOrder(root.right);
        if (right != null)
            left.append(","+right);
        return left;
    }

    TreeNode Deserialize(String str) {
        String[] orders = str.split(";");
        if (orders == null || orders.length == 0) return null;
        int size = orders[0].split(",").length;

        int[] pre = new int[size];
        int[] vin = new int[size];
        int i = 0;
        for (String s : orders[0].split(",")) {
            if (s.equals("")) continue;
            pre[i++] = Integer.parseInt(s);
        }
        i = 0;
        for (String s : orders[1].split(",")) {
            if (s.equals("")) continue;
            vin[i++] = Integer.parseInt(s);
        }
        return reConstructBinaryTree(pre, vin);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int[] vin) {
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
        System.out.println(new Solution3().Serialize(null));
    }
}