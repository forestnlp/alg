package com.alg.leetcode.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 标准模板啊
 */
public class P145M {
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            if(root==null) return Collections.emptyList();
            List<Integer> postOrders = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                if(node!=null) {
                    stack.push(node);
                    stack.push(null);
                    if(node.right!=null) stack.push(node.right);
                    if(node.left!=null) stack.push(node.left);
                }
                else {
                    postOrders.add(stack.pop().val);
                }
            }

            return postOrders;
        }
    }
}
