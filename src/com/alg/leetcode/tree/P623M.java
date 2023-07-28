package com.alg.leetcode.tree;

import java.util.*;

public class P623M {
    class Solution {
        public TreeNode addOneRow(TreeNode root, int v, int d) {
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);
            int depth = 1;

            if(d==1) {
                TreeNode newRoot = new TreeNode(v);
                newRoot.left = root;
                return newRoot;
            }

            while (!que.isEmpty()&&depth<d-1) {
                int size = que.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = que.poll();
                    if(node.left!=null) {
                        que.offer(node.left);
                    }
                    if(node.right!=null) {
                        que.offer(node.right);
                    }
                }
                depth++;
            }

            for(TreeNode p:que){
                TreeNode left = p.left;
                TreeNode right = p.right;
                p.left = new TreeNode(v);
                p.left.left=left;
                p.right = new TreeNode(v);;
                p.right.right = right;
            }

            return root;
        }
    }

    public static void main(String[] args) {
            Integer [] array = {1,2,3,4};
            TreeNode node = TreeNode.getInstance(array);
            P623M problem = new P623M();
            Solution solution = problem.new Solution();
            solution.addOneRow(node,5,4);
    }
}
