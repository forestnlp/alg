package com.alg.dog.tree.leetcode297.bfs;

import com.alg.dog.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    final String SEP = ",";
    final String NULL = "#";
    StringBuilder sb;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node==null){
                sb.append(NULL).append(SEP);
                continue;
            }
            sb.append(node.val).append(SEP);
            queue.offer(node.left);
            queue.offer(node.right);
        }
        return sb.toString();
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        String[] nodes = data.split(SEP);
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for(int i=1;i<nodes.length;){
            TreeNode parent = queue.poll();
            String left = nodes[i++];
            if(!left.equals(NULL)){
                parent.left = new TreeNode(Integer.parseInt(left));
                queue.offer(parent.left);
            }else {
                parent.left = null;
            }

            String right = nodes[i++];
            if(!right.equals(NULL)){
                parent.right = new TreeNode(Integer.parseInt(right));
                queue.offer(parent.right);
            }else {
                parent.right = null;
            }
        }
        return root;
    }

}
