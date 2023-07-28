package com.alg.leetcode.tree;

import java.util.*;

public class P993 {
    class Solution {
        public boolean isCousins(TreeNode root, int x, int y) {
            if (root == null) return false;

            Queue<TreeNode> que = new LinkedList<>();
            Queue<TreeNode> que_parents = new LinkedList<>();

            que.offer(root);
            que_parents.offer(null);

            Map<Integer,TreeNode> map= new HashMap<>();

            while (!que.isEmpty()) {
                //逐层处理
                map.clear();

                int size = que.size();
                while(size>0) {

                    TreeNode node = que.poll();
                    TreeNode parents = que_parents.poll();

                    map.put(node.val,parents);

                    if(node.left!=null) {
                        que.offer(node.left);
                        que_parents.offer(node);
                    }
                    if(node.right!=null) {
                        que.offer(node.right);
                        que_parents.offer(node);
                    }

                    size--;
                }

                if(map.containsKey(x)&&map.containsKey(y)&&!map.get(x).equals(map.get(y)))
                        return true;
            }
            return false;
        }
    }
}
