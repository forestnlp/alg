package com.alg.leetcode.tree;

import java.lang.reflect.Array;
import java.util.*;

public class PM32IM {
    class Solution {
        public int[] levelOrder(TreeNode root) {
            if(root==null) return new int[]{};
            List<Integer> res = new ArrayList<>();
            Queue<TreeNode> que = new LinkedList<>();
            que.add(root);
            while(!que.isEmpty()) {
                int size = que.size();
                while(size>0) {
                    TreeNode node = que.poll();
                    res.add(node.val);
                    if(node.left!=null) que.offer(node.left);
                    if(node.right!=null) que.offer(node.right);
                    size--;
                }
            }
            int[] resArray = new int[res.size()];
            for(int i=0;i<res.size();i++) {
                resArray[i]=res.get(i);
            }
            return resArray;
        }
    }
}
