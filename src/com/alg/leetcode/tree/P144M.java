package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * see P94
 */
public class P144M {
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            List<Integer> preorderNodes = new ArrayList<>();
            if(root==null) return preorderNodes;
            stack.push(root);
            while(!stack.isEmpty()) {
                TreeNode node = stack.pop();
                preorderNodes.add(node.val);

                if(node.right!=null)
                    stack.push(node.right);
                if(node.left!=null)
                    stack.push(node.left);
            }
            return preorderNodes;
        }
    }

    public static void main(String[] args) {
        Integer [] array = {1,null,2,3};
        TreeNode node = TreeNode.getInstance(array);
        P144M problem = new P144M();
        Solution solution = problem.new Solution();
        List<Integer> res = solution.preorderTraversal(node);
        System.out.println(res);
    }
}
