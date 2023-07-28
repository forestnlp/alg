package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P107 {

    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> list = new LinkedList<>();
            Queue<TreeNode> que = new LinkedList<>();
            if(root!=null)
                que.offer(root);

            while(!que.isEmpty()) {
                List<Integer> list_lvl = new ArrayList<>();
                //get the total from the que
                int num = que.size();
                //repeat get the whole elements from the que util it's empty
                for(int i=0;i<num;i++) {
                    //poll one
                    TreeNode q = que.poll();
                    list_lvl.add(q.val);
                    //put them to the que
                    if(q.left!=null) que.offer(q.left);
                    if(q.right!=null) que.offer(q.right);

                }
                list.add(0,list_lvl);
            }
            return list;
        }
    }

}
