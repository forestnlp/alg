package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class  P94M {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> nodes = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            while (cur!=null||!stack.isEmpty())
            {
                while(cur!=null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                cur = stack.pop();
                nodes.add(cur.val);
                cur = cur.right;
            }
            return nodes;
        }
    }
}
