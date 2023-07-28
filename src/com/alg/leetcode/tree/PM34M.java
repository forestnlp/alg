package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PM34M {

    class Solution {

        List<List<Integer>> paths = new ArrayList<>();

        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> pathSum(TreeNode root, int sum) {

            dfs(root,sum);
            return paths;
        }

        public void dfs(TreeNode node,int sum) {

            if(node==null) return;

            int val = node.val;

            path.add(node.val);

            if(val==sum&&node.left==null&&node.right==null)
            {
                paths.add(new LinkedList<Integer>(path));
                path.remove(path.size()-1);
                return;
            }


            dfs(node.left,sum-node.val);
            dfs(node.right,sum-node.val);

            path.remove(path.size()-1);
        }
    }
}
