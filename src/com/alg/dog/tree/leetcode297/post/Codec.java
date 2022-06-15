package com.alg.dog.tree.leetcode297.post;

import com.alg.dog.tree.TreeNode;

import java.util.LinkedList;

public class Codec {

    final String SEP = ",";
    final String NULL = "#";
    StringBuilder sb;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    public void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NULL).append(SEP);
            return;
        }

        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
        sb.append(node.val).append(SEP);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String s : data.split(SEP)) {
            nodes.addLast(s);
        }
        return deserializeHelper(nodes);
    }

    public TreeNode deserializeHelper(LinkedList<String> nodes) {
        if (nodes.isEmpty()) return null;

        String last = nodes.removeLast();
        if (last.equals(NULL)) return null;

        TreeNode root = new TreeNode(Integer.parseInt(last));
        root.right = deserializeHelper(nodes);
        root.left = deserializeHelper(nodes);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);

        String serialize = new Codec().serialize(root);
        System.out.println(serialize);

        TreeNode node = new Codec().deserialize(serialize);
        new Codec().print(node);
    }

    private void print(TreeNode node) {
        if (node == null) {
            System.out.println("null");
            return;
        } else {
            System.out.println(node.val);
        }
        print(node.left);
        print(node.right);
    }
}
