package com.alg.sword.jz77;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Solution {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque();
        if (pRoot == null) return ans;
        queue.offer(pRoot);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> curlevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(reverse)
                    curlevel.add(0,node.val);
                else
                    curlevel.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            reverse=!reverse;
            ans.add(curlevel);
        }
        return ans;
    }

}