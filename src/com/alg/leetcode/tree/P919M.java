package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P919M {

    class CBTInserter {

        List<TreeNode> treeNodes;

        public CBTInserter(TreeNode root) {
            treeNodes = new ArrayList<>();
            treeNodes.add(null);
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);
            while(!que.isEmpty()) {
                int size = que.size();
                for(int i=0;i<size;i++) {
                    TreeNode node = que.poll();
                    treeNodes.add(node);
                    if(node.left!=null) que.offer(node.left);
                    if(node.right!=null) que.offer(node.right);
                }
            }
        }

        public int insert(int v) {
            TreeNode node = new TreeNode(v);
            treeNodes.add(node);
            int vIndex = treeNodes.size()-1;
            int parentIndex = vIndex/2;
            TreeNode parent = treeNodes.get(parentIndex);
            if(parentIndex*2 == vIndex)
                parent.left = node;
            else if(parentIndex*2+1 == vIndex)
                parent.right = node;
            return parent.val;
        }

        public TreeNode get_root() {
            if(treeNodes.size()==1) return null;
            return treeNodes.get(1);
        }
    }
}
